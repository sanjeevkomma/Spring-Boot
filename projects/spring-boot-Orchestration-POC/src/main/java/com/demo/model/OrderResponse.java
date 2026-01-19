package com.demo.model;

public record OrderResponse(String status, String message) {

    public static OrderResponse success(String msg) {
        return new OrderResponse("SUCCESS", msg);
    }

    public static OrderResponse failed(String msg) {
        return new OrderResponse("FAILED", msg);
    }
}
