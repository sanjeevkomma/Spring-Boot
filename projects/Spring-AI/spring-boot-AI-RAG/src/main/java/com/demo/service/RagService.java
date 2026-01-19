package com.demo.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
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

        // 1️⃣ Retrieve similar documents
        List<Document> docs = vectorStore.similaritySearch(
                SearchRequest.query(question).withTopK(3)
        );

        // 2️⃣ Combine context
        String context = docs.stream()
                .map(Document::getContent)
                .collect(Collectors.joining("\n"));

        // 3️⃣ Build prompt text
        String promptText = """
            Answer ONLY using the context below.
            Context:
            %s

            Question:
            %s
            """.formatted(context, question);

        // 4️⃣ Wrap string in Prompt (M1-compatible)
        Prompt promptObj = new Prompt(promptText);

        // 5️⃣ Send to ChatClient
        return chatClient.prompt(promptObj).call().content();
    }
}
