package com.spring.springApplication.service.impl;

import com.spring.springApplication.dao.AccountDao;
import com.spring.springApplication.entity.Account;
import com.spring.springApplication.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public Account addAccount(Account account) {
        Account savedAccount = accountDao.saveAndFlush(account);
        return savedAccount;
    }

    @Override
    public List<Account> getAll() {
        return accountDao.findAll();
    }
}
