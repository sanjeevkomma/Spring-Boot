package com.demo.agent;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AgentMemory {
    private final List<String> history = new ArrayList<>();


    public void add(String msg) {
        history.add(msg);
    }


    public List<String> getHistory() {
        return history;
    }
}