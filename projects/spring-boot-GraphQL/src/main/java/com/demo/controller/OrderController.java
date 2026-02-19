package com.demo.controller;

import com.demo.model.Order;
import com.demo.model.User;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class OrderController {

    @SchemaMapping(typeName = "User", field = "orders")
    public List<Order> orders(User user) {
        return List.of(
                new Order("101", 250.0),
                new Order("102", 500.0)
        );
    }
}
