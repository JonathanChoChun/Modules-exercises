package com.techelevator.handler;

import com.techelevator.model.User;

import java.util.List;

public class UserHandler implements UserManagment {
    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User getById(Long userId) {
        return null;
    }

    @Override
    public List<User> getAll(User currentUser) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public boolean loginAttempt(String username, String password) {
        return false;
    }
}
