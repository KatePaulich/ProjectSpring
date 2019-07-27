package com.spring.springApplication.dao;

import com.spring.springApplication.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface UserDao extends JpaRepository<User, Long> {

   Page<User> findAllBy(Pageable pageable);
}
