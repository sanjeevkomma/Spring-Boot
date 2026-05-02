package com.demo.controller;

import com.demo.model.AgentRequest;
import com.demo.service.AgentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/agent")
@RequiredArgsConstructor
public class AgentController {

    private final AgentService agentService;

    @PostMapping
    public Mono<String> ask(@RequestBody AgentRequest request) {
        return agentService.process(request.getQuery());
    }
}