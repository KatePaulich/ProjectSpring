package com.spring.springApplication.service;

import com.spring.springApplication.entity.Account;

import java.util.List;

public interface AccountService {
    Account addAccount(Account account);
    List<Account> getAll();
}
