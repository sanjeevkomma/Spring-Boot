package com.demo.service;

import com.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> list = new ArrayList<>();

    public List<User> getAllUsers() {

        User u1 = new User(1,"name1","email1@gmail.com");
        User u2 = new User(2,"name2","email2@gmail.com");
        User u3 = new User(3,"name3","email3@gmail.com");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        return list;
    }

    public void createUser(User user) {
        list.add(user);
    }

}