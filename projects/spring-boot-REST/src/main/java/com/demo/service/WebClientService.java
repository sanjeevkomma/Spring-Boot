package com.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebClientService {

    private final WebClient webClient;

    public WebClientService(WebClient webClient) {
        this.webClient = webClient;
    }

    public String fetchData(String param) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/markets").
                        queryParam("vs_currency", param).build())
                .retrieve()
                .bodyToMono(String.class)
                .block(); // Blocking call (Use only if you are not in a reactive app)
    }
}

