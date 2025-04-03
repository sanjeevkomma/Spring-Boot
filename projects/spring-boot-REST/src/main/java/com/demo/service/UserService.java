package com.demo.service;

import com.demo.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String API_URL = "https://jsonplaceholder.typicode.com/users";

    public List<User> fetchUsers() {
        // Call the public API
        User[] users = restTemplate.getForObject(API_URL, User[].class);

        // Transform the response
        return users != null ? transformResponse(Arrays.asList(users)) : List.of();
    }

    private List<User> transformResponse(List<User> users) {
        return users.stream()
                .peek(user -> user.setName(user.getName().toUpperCase())) // Example: Convert names to uppercase
                .collect(Collectors.toList());
    }
}

