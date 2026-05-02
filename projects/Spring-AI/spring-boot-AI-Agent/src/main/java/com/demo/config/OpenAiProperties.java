package com.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Data
@Component
@ConfigurationProperties(prefix = "openai.api")
public class OpenAiProperties {

    private String key;
    private String baseUrl;
    private String model;
    private Duration timeout;
}