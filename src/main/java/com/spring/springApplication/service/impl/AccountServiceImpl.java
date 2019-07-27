package com.spring.springApplication.service.impl;

import com.spring.springApplication.dao.AccountDao;
import com.spring.springApplication.entity.Account;
import com.spring.springApplication.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public List<Account> getAll() {
        return accountDao.findAll();
    }

    @Override
    public int getSumm() {
        return accountDao.getSumm();
    }
}
