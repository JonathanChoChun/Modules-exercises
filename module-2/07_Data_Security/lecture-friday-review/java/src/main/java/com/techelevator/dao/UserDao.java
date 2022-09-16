package com.techelevator.dao;

import com.techelevator.model.User;

import java.util.List;

public interface UserDao {
    User getUser(String username);
    User getUser(Long userId);
    List<User> getAllUsers();
    User saveUser(User user);
    boolean updatePassword(User user);
    boolean saveLoginAttempt(User user, boolean isSuccess);
    User addUser(User user);
}
