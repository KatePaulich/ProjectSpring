package com.spring.springApplication.service.impl;

import com.spring.springApplication.dao.UserDao;
import com.spring.springApplication.entity.User;
import com.spring.springApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }

    @Override
    public List<User> getRichestUser() {
        return userDao.getRichestUser();
    }
}
