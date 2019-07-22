package com.example1.service;

import com.example1.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    int addChivalrous(User user);
}
