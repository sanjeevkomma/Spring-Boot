package com.demo.service;

import com.demo.model.User;
import com.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(User user){
        user.setUserId(UUID.randomUUID().toString());
        user.setCreatedAt(Instant.now());
        return userRepository.save(user);
    }

    public User getUserById(String id){
        return userRepository.findById(id).orElseThrow();
    }
}
