package com.demo.service;

import com.demo.model.OrderRequest;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    public boolean reserveItems(OrderRequest request) {
        return true;
    }
}
