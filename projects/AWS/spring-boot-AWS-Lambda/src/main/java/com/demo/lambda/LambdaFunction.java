package com.demo.lambda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class LambdaFunction {

    @Bean
    public Function<String, String> hello() {
        return (String value) -> "Hello from Lambda, " + value;
    }
}