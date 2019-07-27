package com.spring.springApplication.service;

import com.spring.springApplication.entity.User;

import java.util.List;

public interface UserSirvise {

    User addUser(User user);
    List<User> getAll();
}
