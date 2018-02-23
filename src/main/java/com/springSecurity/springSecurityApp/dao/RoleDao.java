package com.springSecurity.springSecurityApp.dao;

import com.springSecurity.springSecurityApp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
