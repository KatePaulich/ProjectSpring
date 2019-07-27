package com.spring.springApplication.controller;

import com.spring.springApplication.entity.Account;
import com.spring.springApplication.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping
    public String account(Map<String, Object> model) {
        Iterable<Account> accounts = accountService.getAll();
        model.put("accounts", accounts);
        return "main";
    }

    @PostMapping("summ")
    public String summ(Map<String, Object> model) {
        int summ = accountService.getSumm();
        model.put("summ", summ);
        return "summ";
    }

}
