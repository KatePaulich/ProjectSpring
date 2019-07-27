package com.spring.springApplication.dao;

import com.spring.springApplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, Integer> {

}
