package com.kaho.springbootmall.service;

import com.kaho.springbootmall.dto.UserLoginRequest;
import com.kaho.springbootmall.dto.UserRegisterRequest;
import com.kaho.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
