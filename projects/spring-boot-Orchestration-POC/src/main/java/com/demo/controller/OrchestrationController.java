package com.demo.controller;

import com.demo.model.OrderRequest;
import com.demo.model.OrderResponse;
import com.demo.orchestrator.OrderOrchestrator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrchestrationController {

    private final OrderOrchestrator orchestrator;

    public OrchestrationController(OrderOrchestrator orchestrator) {
        this.orchestrator = orchestrator;
    }

    @PostMapping("/process")
    public OrderResponse process(@RequestBody OrderRequest request) {
        return orchestrator.process(request);
    }
}
