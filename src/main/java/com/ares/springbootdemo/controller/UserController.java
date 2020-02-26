package com.ares.springbootdemo.controller;

import com.ares.springbootdemo.model.User;
import com.ares.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class UserController {
    //почитать
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String findAll(Model model){
        List<User> users = null;
        model.addAttribute("users",users);
        return  "user-list";
    }

    @GetMapping("/user-create")
    public String createUserForm(User user){
        return "user-create";
    }

    //почитать
    @PostMapping
    public String createUser(user){
        userService.saveUser(user);
        return "redirect:/users";
    }
}
