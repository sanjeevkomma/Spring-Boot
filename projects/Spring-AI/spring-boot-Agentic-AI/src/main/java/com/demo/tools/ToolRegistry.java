package com.demo.tools;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ToolRegistry {


    private final Map<String, Tool> tools = new HashMap<>();


    public ToolRegistry(List<Tool> toolList) {
        toolList.forEach(t -> tools.put(t.name(), t));
    }


    public Tool get(String name) {
        return tools.get(name);
    }
}