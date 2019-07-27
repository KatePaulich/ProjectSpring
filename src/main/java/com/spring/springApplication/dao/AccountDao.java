package com.spring.springApplication.dao;

import com.spring.springApplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountDao extends JpaRepository<Account, Integer> {

    @Query("select sum(A.account) from account A")
    int getSumm();
}
