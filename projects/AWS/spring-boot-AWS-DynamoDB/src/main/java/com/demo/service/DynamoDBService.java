package com.demo.service;

import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.ListTablesResponse;

import java.util.List;

@Service
public class DynamoDBService {

    private final DynamoDbClient dynamoDbClient;

    public DynamoDBService(DynamoDbClient dynamoDbClient) {
        this.dynamoDbClient = dynamoDbClient;
    }

    public List<String> listTables() {
        ListTablesResponse response = dynamoDbClient.listTables();
        return response.tableNames();
    }
}
