package com.ares.springbootdemo.controller;

import com.ares.springbootdemo.model.User;
import com.ares.springbootdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class UserController {

    private UserService userService;

    @GetMapping("/users")
    public String findAll(){
        List<User> users = null;

        return  "";
    }
}
