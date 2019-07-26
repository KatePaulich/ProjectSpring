package com.spring.springApplication.repos;

import com.spring.springApplication.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepos extends JpaRepository<UserEntity, Integer> {
}
