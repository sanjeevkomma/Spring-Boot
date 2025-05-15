package com.demo.service;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final OpenAiChatClient chatClient;

    public AiService(@Value("${spring.ai.openai.api-key}") String apiKey) {
        this.chatClient = new OpenAiChatClient(apiKey);
    }

    public String getAIResponse(String prompt) {
        return chatClient.call(prompt);
    }
}

