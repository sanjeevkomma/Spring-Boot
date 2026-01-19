package com.demo.service;

import com.demo.model.OrderRequest;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void notifyUser(OrderRequest request) {
        System.out.println("User notified");
    }
}

