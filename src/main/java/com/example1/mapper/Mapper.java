package com.example1.mapper;

import com.example1.entity.User;

import java.util.List;

public interface Mapper {
    List<User> findAll();

    int addChivalrous(User user);
}
