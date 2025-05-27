package com.demo.service;

import com.demo.struct.User;

public class UserServiceImpl implements UserService.Iface {
    @Override
    public User getUser(int id) {
        User user = new User();
        user.setId(id);
        user.setName("Alice");
        return user;
    }
}