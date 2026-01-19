package com.demo.service;

import com.demo.model.Order;

import java.util.List;

public interface BigQueryOrderService {

    void insertOrder(Order order);

    List<Order> fetchOrders() throws InterruptedException;

}
