package com.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AgentService {

    private final LlmClient llmClient;
    private final ToolService toolService;

    public Mono<String> process(String query) {

        return llmClient.ask(query)
                .flatMap(response -> {

                    if (isToolCall(response)) {
                        return Mono.fromSupplier(() ->
                                toolService.getWeather("Hyderabad")
                        );
                    }

                    return Mono.just(response);
                });
    }

    private boolean isToolCall(String response) {
        return response != null && response.toLowerCase().contains("weather");
    }
}