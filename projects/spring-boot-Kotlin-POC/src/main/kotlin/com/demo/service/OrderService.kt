package com.demo.service

import com.demo.model.Order
import org.springframework.stereotype.Service

@Service
class OrderService {

    fun getOrder(orderId: String): Order {
        return Order(
            orderId = orderId,
            productName = "MacBook Pro",
            price = 2499.99
        )
    }
}
