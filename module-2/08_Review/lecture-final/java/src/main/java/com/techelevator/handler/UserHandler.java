package com.techelevator.handler;

import com.techelevator.dao.UserDao;
import com.techelevator.helpers.PasswordHasher;
import com.techelevator.model.User;
import org.bouncycastle.util.encoders.Base64;

import java.util.ArrayList;
import java.util.List;

public class UserHandler implements UserManagment {
    private UserDao userDao;
    public UserHandler(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public User getByUsername(String username) {
        return userDao.getUser(username);
    }

    @Override
    public User getById(Long userId) {
        return userDao.getUser(userId);
    }

    @Override
    public List<User> getAll(User currentUser) {
        if (currentUser.getUserrole().equalsIgnoreCase("admin")) {
            return userDao.getAllUsers();
        }
        return new ArrayList<>();
    }

    @Override
    public User save(User user) {
        if (user.getUserId()==0) {
            return userDao.addUser(user);
        } else {
            return userDao.saveUser(user);
        }
    }

    @Override
    public User loginAttempt(String username, String password) {
        if ((username==null) || (username.isEmpty()) || (password==null) || (password.isEmpty())) return null;
        User user = userDao.getUser(username);
        if (user==null) return null;
        PasswordHasher hasher = new PasswordHasher();
        String hashedPw = hasher.computeHash(username,Base64.decode(user.getUserPasswordSalt()));
        if (!hashedPw.equals(user.getUserPasswordHash())) {
            userDao.saveLoginAttempt(user,false);
            return null;
        }
        userDao.saveLoginAttempt(user,true);
        return user;
    }

    @Override
    public boolean changePassword(User user, String password) {
        return false;
    }
}
