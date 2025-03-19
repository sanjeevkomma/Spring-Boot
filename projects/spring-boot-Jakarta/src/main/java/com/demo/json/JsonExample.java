package com.demo.json;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class JsonExample {
    public static void main(String[] args) {
        JsonObject json = Json.createObjectBuilder()
                .add("message", "Hello, JSON-P!")
                .build();
        System.out.println(json.toString());
    }
}

