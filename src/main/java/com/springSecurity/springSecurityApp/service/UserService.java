package com.springSecurity.springSecurityApp.service;

import com.springSecurity.springSecurityApp.model.User;

/**
 * Service class for {@link com.springSecurity.springSecurityApp.model.User}
 * @author Ihor Savchenko
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
