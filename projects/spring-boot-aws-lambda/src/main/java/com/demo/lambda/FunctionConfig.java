package com.demo.lambda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class FunctionConfig {
    @Bean
    public Function<String, String> uppercase() {
        return value -> value.toUpperCase();
    }
}
