package com.demo.controller;

import com.demo.model.Order;
import com.demo.service.OrderPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderPublisher publisher;

    public OrderController(OrderPublisher publisher) {
        this.publisher = publisher;
    }

    @PostMapping
    public String publishOrder(@RequestBody Order order) {
        publisher.publish(order);
        return "Order published to Pub/Sub";
    }
}
