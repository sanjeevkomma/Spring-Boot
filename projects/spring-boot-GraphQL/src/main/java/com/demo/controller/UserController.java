package com.demo.controller;

import com.demo.model.User;
import org.springframework.graphql.data.federation.EntityMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @QueryMapping
    public User user(@Argument String id) {
        return new User(id, "Sanjeev", "sanjeev@example.com");
    }

    @EntityMapping
    public User user(@Argument String id, @Argument String name) {
        return new User(id, "Sanjeev", "sanjeev@example.com");
    }
}
