package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.chat.embedding.EmbeddingModel;

@Configuration
public class RagConfig {

    // VectorStore bean (in-memory)
    @Bean
    public VectorStore vectorStore(EmbeddingModel embeddingModel) {
        return new SimpleVectorStore(embeddingModel);
    }

    // ChatClient bean if not already defined
    @Bean
    public ChatClient.Builder chatClientBuilder() {
        return ChatClient.builder(); // configure as needed (openAI key, model etc.)
    }
}
