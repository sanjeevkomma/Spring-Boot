package com.demo.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RagService {

    private final ChatClient chatClient;
    private final VectorStore vectorStore;

    public RagService(ChatClient.Builder builder, VectorStore vectorStore) {
        this.chatClient = builder.build();
        this.vectorStore = vectorStore;
    }

    public String ask(String question) {

        List<Document> docs = vectorStore.similaritySearch(
                SearchRequest.query(question).withTopK(3)
        );

        String context = docs.stream()
                .map(Document::getContent)
                .collect(Collectors.joining("\n"));

        return chatClient.prompt()
                .system("""
                    Answer ONLY using the context below.
                    Context:
                    %s
                    """.formatted(context))
                .user(question)
                .call()
                .content();
    }
}
