package com.kaho.springbootmall.service.impl;

import com.kaho.springbootmall.dao.UserDao;
import com.kaho.springbootmall.dto.UserRegisterRequest;
import com.kaho.springbootmall.model.User;
import com.kaho.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
