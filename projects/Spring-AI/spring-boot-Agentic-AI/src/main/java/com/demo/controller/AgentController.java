package com.demo.controller;

import com.demo.agent.AiAgent;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agent")
public class AgentController {

    private final AiAgent agent;

    public AgentController(AiAgent agent) {
        this.agent = agent;
    }


    @PostMapping("/run")
    public String run(@RequestBody String input) {
        return agent.run(input);
    }
}
