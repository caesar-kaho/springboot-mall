package com.kaho.springbootmall.dao;

import com.kaho.springbootmall.dto.UserRegisterRequest;
import com.kaho.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserByEmail(String email);

}
