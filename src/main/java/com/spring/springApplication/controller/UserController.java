package com.spring.springApplication.controller;

import com.spring.springApplication.entity.User;
import com.spring.springApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public String user(Map<String, Object> model) {
        Iterable<User> users = userService.getAll();
        model.put("users", users);
        return "main";
    }

    @PostMapping("richestUser")
    public String getRichestUser(Map<String, Object> model) {
        Iterable<User> richestUser = userService.getRichestUser();
        model.put("users", richestUser);
        return "richestUser";
    }

}
