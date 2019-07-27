package com.spring.springApplication.service.impl;

import com.spring.springApplication.dao.UserDao;
import com.spring.springApplication.entity.User;
import com.spring.springApplication.service.UserSirvise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserSirvise {

    @Autowired
    private UserDao userDao;

    @Override
    public User addUser(User user) {
        User savedUser = userDao.saveAndFlush(user);
        return savedUser;
    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
}
