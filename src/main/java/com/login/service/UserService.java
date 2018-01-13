package com.login.service;

import com.login.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}