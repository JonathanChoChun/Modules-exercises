package com.techelevator.handler;

import com.techelevator.model.User;

import java.util.List;

public interface UserManagment {
    User getByUsername(String username);
    User getById(Long userId);
    List<User> getAll(User currentUser);
    User save(User user);
    boolean loginAttempt(String username, String password );
}
