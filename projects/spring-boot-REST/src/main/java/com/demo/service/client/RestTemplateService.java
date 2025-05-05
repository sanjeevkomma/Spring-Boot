package com.demo.service.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RestTemplateService {
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final String apiUrl;

    public RestTemplateService(RestTemplate restTemplate, ObjectMapper objectMapper, @Value("${api.url}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
        this.apiUrl = apiUrl;
    }

    public JsonNode fetchData() {
        String response = restTemplate.getForObject(apiUrl, String.class);
        try {
            return objectMapper.readTree(response);
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse JSON", e);
        }
    }
}