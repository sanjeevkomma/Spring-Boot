package com.demo.orchestrator;

import com.demo.model.OrderRequest;
import com.demo.model.OrderResponse;
import com.demo.service.InventoryService;
import com.demo.service.NotificationService;
import com.demo.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class OrderOrchestrator {

    private final PaymentService paymentService;
    private final InventoryService inventoryService;
    private final NotificationService notificationService;

    public OrderOrchestrator(
            PaymentService paymentService,
            InventoryService inventoryService,
            NotificationService notificationService) {
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
        this.notificationService = notificationService;
    }

    public OrderResponse process(OrderRequest request) {

        // Step 1: Payment
        boolean paymentSuccess = paymentService.processPayment(request);
        if (!paymentSuccess) {
            return OrderResponse.failed("Payment failed");
        }

        // Step 2: Inventory
        boolean inventoryReserved = inventoryService.reserveItems(request);
        if (!inventoryReserved) {
            return OrderResponse.failed("Inventory unavailable");
        }

        // Step 3: Notification
        notificationService.notifyUser(request);

        return OrderResponse.success("Order processed successfully");
    }
}
