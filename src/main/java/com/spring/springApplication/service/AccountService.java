package com.spring.springApplication.service;

import com.spring.springApplication.entity.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAll();
    int getSumm();
}
