package com.springSecurity.springSecurityApp.dao;

import com.springSecurity.springSecurityApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
