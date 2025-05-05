package com.demo.telemetry.service;


import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import java.util.HashMap;
import java.util.Map;

@Service
public class TelemetryService {

    private final DynamoDbClient dynamoDb = DynamoDbClient.create();
    private final String tableName = "TelemetryData";

    public void saveData(TelemetryData data) {
        Map<String, AttributeValue> item = new HashMap<>();
        item.put("deviceId", AttributeValue.fromS(data.getDeviceId()));
        item.put("timestamp", AttributeValue.fromS(data.getTimestamp().toString()));
        item.put("temperature", AttributeValue.fromN(data.getTemperature().toString()));

        PutItemRequest request = PutItemRequest.builder()
                .tableName(tableName)
                .item(item)
                .build();

        dynamoDb.putItem(request);
    }
}
