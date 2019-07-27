package com.spring.springApplication.dao;

import com.spring.springApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {

    @Query("select U from users U inner join account A on U.users.id = A.account.userId where A.account = (select max(A.account) from account A)")
    List<User> getRichestUser();
}
