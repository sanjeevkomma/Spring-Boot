package com.demo.service;

import com.demo.entity.User;
import com.demo.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User createUser(String name) {
        User user = new User();
        user.setName(name);
        return userRepository.save(user);
    }
}

