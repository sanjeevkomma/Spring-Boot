package com.demo.model;

public record OrderRequest(String orderId, String userId, double amount) {}
