package com.demo.controller;

import com.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public Mono<User> getUser(@PathVariable Long id) {
        return Mono.just(new User(id, "John"))
                .delayElement(Duration.ofSeconds(1));
    }

    @GetMapping("/users")
    public Flux<User> getAllUsers() {
        List<User> users = List.of(
                new User(1L, "A"),
                new User(2L, "B"),
                new User(3L, "C")
        );

        return Flux.fromIterable(users)
                .delayElements(Duration.ofSeconds(1));
    }
}