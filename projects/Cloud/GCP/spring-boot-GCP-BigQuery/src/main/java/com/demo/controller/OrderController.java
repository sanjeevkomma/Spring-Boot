package com.demo.controller;

import com.demo.model.Order;
import com.demo.service.BigQueryOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final BigQueryOrderService service;

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        service.insertOrder(order);
        return ResponseEntity.ok("Order inserted into BigQuery");
    }

    @GetMapping
    public List<Order> getOrders() throws InterruptedException {
        return service.fetchOrders();
    }
}
