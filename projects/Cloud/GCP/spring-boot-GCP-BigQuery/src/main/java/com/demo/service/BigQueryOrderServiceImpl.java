package com.demo.service;

import com.demo.model.Order;

import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryOptions;
import com.google.cloud.bigquery.FieldValueList;
import com.google.cloud.bigquery.InsertAllRequest;
import com.google.cloud.bigquery.InsertAllResponse;
import com.google.cloud.bigquery.QueryJobConfiguration;
import com.google.cloud.bigquery.TableId;
import com.google.cloud.bigquery.TableResult;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BigQueryOrderServiceImpl implements BigQueryOrderService {

    private final BigQuery bigQuery = BigQueryOptions.getDefaultInstance().getService();
    private static final String DATASET = "ecommerce";
    private static final String TABLE = "orders";

    public void insertOrder(Order order) {

        TableId tableId = TableId.of(DATASET, TABLE);

        Map<String, Object> row = new HashMap<>();
        row.put("order_id", order.getOrderId());
        row.put("customer_id", order.getCustomerId());
        row.put("amount", order.getAmount());
        row.put("status", order.getStatus());
        row.put("created_at", Instant.now().toString());

        InsertAllResponse response =
                bigQuery.insertAll(
                        InsertAllRequest.newBuilder(tableId)
                                .addRow(row)
                                .build()
                );

        if (response.hasErrors()) {
            throw new RuntimeException("BigQuery insert failed: " + response.getInsertErrors());
        }
    }

    public List<Order> fetchOrders() throws InterruptedException {

        String query = "SELECT order_id, customer_id, amount, status " +
                "FROM ecommerce.orders ORDER BY created_at DESC LIMIT 10";

        QueryJobConfiguration config =
                QueryJobConfiguration.newBuilder(query).build();

        TableResult result = bigQuery.query(config);

        List<Order> orders = new ArrayList<>();
        for (FieldValueList row : result.iterateAll()) {
            orders.add(new Order(
                    row.get("order_id").getStringValue(),
                    row.get("customer_id").getStringValue(),
                    row.get("amount").getDoubleValue(),
                    row.get("status").getStringValue()
            ));
        }
        return orders;
    }
}
