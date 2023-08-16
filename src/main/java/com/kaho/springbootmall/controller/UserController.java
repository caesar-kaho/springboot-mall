package com.kaho.springbootmall.controller;

import com.kaho.springbootmall.dto.UserLoginRequest;
import com.kaho.springbootmall.dto.UserRegisterRequest;
import com.kaho.springbootmall.model.User;
import com.kaho.springbootmall.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags="User APIs")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("user registeration")
    @ApiResponses({@ApiResponse(code=201,message="registeration success")})
    @PostMapping("/users/register")
    public ResponseEntity<User> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest) {
        Integer userId = userService.register(userRegisterRequest);

        User user = userService.getUserById(userId);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @ApiOperation("user login")
    @ApiResponses({@ApiResponse(code=200,message = "login success")})
    @PostMapping("/users/login")
    public ResponseEntity<User> login(@RequestBody @Valid UserLoginRequest userLoginRequest) {

        User user = userService.login(userLoginRequest);

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
