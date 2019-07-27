package com.spring.springApplication.controller;

import com.spring.springApplication.dao.UserDao;
import com.spring.springApplication.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GretingController {
    @Autowired
    UserDao userDao;

    @RequestMapping()
    @ResponseBody
    public String test(){
        User user = new User();
        user.setName("Ivan");
        user.setSurname("Popov");
        userDao.saveAndFlush(user);
        return "hello";
    }
}
