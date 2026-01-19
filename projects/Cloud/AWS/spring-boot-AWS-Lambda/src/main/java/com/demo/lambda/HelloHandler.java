package com.demo.lambda;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class HelloHandler implements Function<String, String> {
    @Override
    public String apply(String input) {
        return "Hello from Lambda, " + input + "!";
    }
}
