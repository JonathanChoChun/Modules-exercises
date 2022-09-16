package com.techelevator.dao;

import com.techelevator.model.User;

import java.util.List;

public class UserDaoJdbc implements UserDao{
    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public User getUser(Long userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public boolean updatePassword(User user) {
        return false;
    }

    @Override
    public boolean saveLoginAttempt(User user, boolean isSuccess) {
        return false;
    }

    @Override
    public User addUser(User user) {
        return null;
    }
}
