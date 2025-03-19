package com.demo.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GreetingService {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}

class GreetingController {
    @Inject
    GreetingService greetingService;

    public void execute() {
        System.out.println(greetingService.greet("Jakarta"));
    }
}
