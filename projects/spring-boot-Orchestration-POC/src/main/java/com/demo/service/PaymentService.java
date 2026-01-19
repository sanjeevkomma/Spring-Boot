package com.demo.service;

import com.demo.model.OrderRequest;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public boolean processPayment(OrderRequest request) {
        return true; // simulate success
    }
}
