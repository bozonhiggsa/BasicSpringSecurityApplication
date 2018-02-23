package com.springSecurity.springSecurityApp.service;

/**
 * Service for Security.
 * @author Ihor Savchenko
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
