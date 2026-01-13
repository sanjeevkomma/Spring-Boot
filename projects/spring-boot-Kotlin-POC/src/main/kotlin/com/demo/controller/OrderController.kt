package com.demo.controller

import com.demo.model.Order
import com.demo.service.OrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController(
    private val orderService: OrderService
) {

    @GetMapping("/orders/{orderId}")
    fun getOrder(@PathVariable orderId: String): Order {
        return orderService.getOrder(orderId)
    }
}
