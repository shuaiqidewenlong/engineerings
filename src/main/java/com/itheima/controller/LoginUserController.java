package com.itheima.controller;

import com.itheima.pojo.LoginUsers;
import com.itheima.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: engineerings
 * @author: wenlong
 * @create: 2020-09-30 11:04
 */
@RestController
public class LoginUserController {
    @Autowired
    LoginUserService loginUserService;

    @GetMapping("readLoginUsers")
    List<LoginUsers> readLoginUsers(){
        return  loginUserService.readLoginUsers();
    }
}
