package com.demo.controller;

import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/users")
    public @ResponseBody List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/api/users")
    public @ResponseBody String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "User created: " + user.getName();
    }

}