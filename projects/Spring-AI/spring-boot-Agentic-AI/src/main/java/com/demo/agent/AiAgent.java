package com.demo.agent;

import com.demo.tools.Tool;
import com.demo.tools.ToolRegistry;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
public class AiAgent {


    private final ChatClient chatClient;
    private final ToolRegistry toolRegistry;
    private final AgentMemory memory;


    public AiAgent(ChatClient chatClient,
                   ToolRegistry toolRegistry,
                   AgentMemory memory) {
        this.chatClient = chatClient;
        this.toolRegistry = toolRegistry;
        this.memory = memory;
    }


    public String run(String userInput) {


        memory.add("User: " + userInput);


        String prompt = """
You are an AI agent.
Decide which tool to use.
Respond ONLY in JSON.


Tools:
- get_time


User request: %s


JSON format:
{ "tool": "tool_name", "input": "tool_input" }
""".formatted(userInput);


        String decision = chatClient.prompt(prompt).call().content();


        JsonNode node = null;
        try {
            node = new ObjectMapper().readTree(decision);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        String toolName = node.get("tool").asText();
        String toolInput = node.get("input").asText();


        Tool tool = toolRegistry.get(toolName);
        String result = tool.execute(toolInput);


        memory.add("Tool result: " + result);


        return "Final Answer: " + result;
    }
}