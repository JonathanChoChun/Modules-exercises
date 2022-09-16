package com.techelevator.dao;

import com.techelevator.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import javax.sql.RowSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoJdbc implements UserDao{
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    public UserDaoJdbc(DataSource dataSource){
        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    @Override
    public User getUser(String username) {
        String sql = "select\n" +
                "    UserId\n" +
                "    ,Username\n" +
                "    ,Userrole\n" +
                "    ,UserPasswordHash\n" +
                "    ,UserPasswordSalt\n" +
                "    ,PasswordAlgorithm\n" +
                "    ,IsForcePasswordChange\n" +
                "    ,IsForceUserChange\n" +
                "    ,CreateDate\n" +
                "    ,LanguageCode\n" +
                "    ,DenyAccess\n" +
                "    from\n" +
                "        AppUser\n" +
                "where\n" +
                "   Username = :username;";
        Map<String,Object> params = new HashMap<>();
        params.put("username", username);
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql,params);
        if  (results.next()){
            return mapRowToUser(results);
        }
        return null;
    }
    private User mapRowToUser(SqlRowSet results) {
        User user = new User();
        user.setUserId(results.getLong("UserId"));
        user.setIsForceUserChange(results.getBoolean("IsForceUserChange"));
        user.setDenyAccess(results.getBoolean("DenyAccess"));
        user.setUsername(results.getString("Username"));
        user.setUserrole(results.getString("Userrole"));
        user.setIsForcePasswordChange(results.getBoolean("IsForcePasswordChange"));
        user.setLanguageCode(results.getString("LanguageCode"));

        user.setUserPasswordHash(results.getString("UserPasswordHash"));
        user.setPasswordAlgorithm(results.getString("PasswordAlgorithm"));
        user.setUserPasswordSalt(results.getString("UserPasswordSalt"));
        return user;
    }
    @Override
    public User getUser(Long userId) {

        String sql = "select\n" +
                "    UserId\n" +
                "    ,Username\n" +
                "    ,Userrole\n" +
                "    ,UserPasswordHash\n" +
                "    ,UserPasswordSalt\n" +
                "    ,PasswordAlgorithm\n" +
                "    ,IsForcePasswordChange\n" +
                "    ,IsForceUserChange\n" +
                "    ,CreateDate\n" +
                "    ,LanguageCode\n" +
                "    ,DenyAccess\n" +
                "    from\n" +
                "        AppUser\n" +
                "where\n" +
                "   UserId = :id;";
        Map<String,Object> params = new HashMap<>();
        params.put("id", userId);
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql,params);
        if  (results.next()){
            return mapRowToUser(results);
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "select\n" +
                "    UserId\n" +
                "    ,Username\n" +
                "    ,Userrole\n" +
                "    ,UserPasswordHash\n" +
                "    ,UserPasswordSalt\n" +
                "    ,PasswordAlgorithm\n" +
                "    ,IsForcePasswordChange\n" +
                "    ,IsForceUserChange\n" +
                "    ,CreateDate\n" +
                "    ,LanguageCode\n" +
                "    ,DenyAccess\n" +
                "    from\n" +
                "        AppUser;";
        Map<String,Object> params = new HashMap<>();
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql,params);
        List<User> users = new ArrayList<>();
        while  (results.next()){
            users.add(mapRowToUser(results));
        }
        return users;
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
