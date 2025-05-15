package com.demo.controller;


import com.demo.service.DynamoDBService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DynamoDBController {

    private final DynamoDBService dynamoDBService;

    public DynamoDBController(DynamoDBService dynamoDBService) {
        this.dynamoDBService = dynamoDBService;
    }

    @GetMapping("/tables")
    public List<String> getTables() {
        return dynamoDBService.listTables();
    }
}
