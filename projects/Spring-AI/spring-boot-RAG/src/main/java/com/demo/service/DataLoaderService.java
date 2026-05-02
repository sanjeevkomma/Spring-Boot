package com.demo.service;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!test")
public class DataLoaderService {

    private final RagService ragService;

    public DataLoaderService(RagService ragService) {
        this.ragService = ragService;
    }

    @PostConstruct
    public void load() {

        ragService.addDocument("Caching improves API performance.");
        ragService.addDocument("Database indexing reduces query time.");
        ragService.addDocument("Load balancing distributes traffic efficiently.");

        System.out.println("Data loaded into vector store.");
    }
}