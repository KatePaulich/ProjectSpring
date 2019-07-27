package com.spring.springApplication.service;

import com.spring.springApplication.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    List<User> getRichestUser();
}
