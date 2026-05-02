package com.demo.service;

import com.demo.config.OpenAiProperties;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class LlmClient {

    private final WebClient webClient;
    private final OpenAiProperties properties;

    public Mono<String> ask(String prompt) {

        return webClient.post()
                .uri("/v1/chat/completions")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + properties.getKey())
                .bodyValue(buildRequest(prompt))
                .retrieve()
                .bodyToMono(JsonNode.class)
                .timeout(properties.getTimeout())
                .map(this::extractContent);
    }

    private Map<String, Object> buildRequest(String prompt) {
        return Map.of(
                "model", properties.getModel(),
                "messages", List.of(
                        Map.of("role", "user", "content", prompt)
                )
        );
    }

    private String extractContent(JsonNode json) {
        return json.path("choices")
                .get(0)
                .path("message")
                .path("content")
                .asText();
    }
}