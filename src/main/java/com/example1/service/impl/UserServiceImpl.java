package com.example1.service.impl;

import com.example1.entity.User;
import com.example1.mapper.Mapper;
import com.example1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private Mapper mapper;
    public List<User> findAll() {
        return mapper.findAll();
    }

    @Override
    public int addChivalrous(User user) {
        return mapper.addChivalrous(user);
    }
}
