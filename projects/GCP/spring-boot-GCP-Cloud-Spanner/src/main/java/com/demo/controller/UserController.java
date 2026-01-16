package com.demo.controller;

import com.demo.model.User;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.UUID;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User create(@RequestBody User user) {
        user.setUserId(UUID.randomUUID().toString());
        user.setCreatedAt(Instant.now());
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User get(@PathVariable String id) {
        return userService.getUserById(id);
    }
}
