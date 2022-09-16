package com.techelevator.model;

import java.util.Objects;

public class User {

    private long userId;
    private String username;
    private String userrole;
    private String userPasswordHash;
    private String userPasswordSalt;
    private String passwordAlgorithm;
    private boolean isForcePasswordChange;
    private boolean isForceUserChange;
    private String languageCode;
    private boolean denyAccess;

    public User() {
    }

    public boolean isForcePasswordChange() {
        return isForcePasswordChange;
    }

    public void setForcePasswordChange(boolean forcePasswordChange) {
        isForcePasswordChange = forcePasswordChange;
    }

    public boolean isForceUserChange() {
        return isForceUserChange;
    }

    public void setForceUserChange(boolean forceUserChange) {
        isForceUserChange = forceUserChange;
    }

    public boolean isDenyAccess() {
        return denyAccess;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public String getUserPasswordHash() {
        return userPasswordHash;
    }

    public void setUserPasswordHash(String userPasswordHash) {
        this.userPasswordHash = userPasswordHash;
    }

    public String getUserPasswordSalt() {
        return userPasswordSalt;
    }

    public void setUserPasswordSalt(String userPasswordSalt) {
        this.userPasswordSalt = userPasswordSalt;
    }

    public String getPasswordAlgorithm() {
        return passwordAlgorithm;
    }

    public void setPasswordAlgorithm(String passwordAlgorithm) {
        this.passwordAlgorithm = passwordAlgorithm;
    }
    public void setIsForcePasswordChange(boolean isForcePasswordChange) {
        this.isForcePasswordChange = isForcePasswordChange;
    }

    public boolean getIsForceUserChange() {
        return isForceUserChange;
    }

    public void setIsForceUserChange(boolean isForceUserChange) {
        this.isForceUserChange = isForceUserChange;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public boolean getDenyAccess() {
        return denyAccess;
    }

    public void setDenyAccess(boolean denyAccess) {
        this.denyAccess = denyAccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return (userId == user.userId) && username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username);
    }
}
