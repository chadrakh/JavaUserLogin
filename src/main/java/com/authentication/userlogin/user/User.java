package com.authentication.userlogin.model;

public class User {
    private final String USERNAME;
    private final String PASSWORD;
    private UserType userType;

    public User(String username, String password) {
        this.USERNAME = username;
        this.PASSWORD = password;
    }

    public User(String username, String password, String token) {
        this.USERNAME = username;
        this.PASSWORD = password;
        this.userType = checkUserType(token);
    }

    public String getUsername() {
        return USERNAME;
    }

    public String getPassword() {
        return PASSWORD;
    }

    public UserType getUserType() {
        return userType;
    }

    private UserType checkUserType(String token) {
        return token.equals("secret-code") ? UserType.ADMIN : UserType.STANDARD;
    }
}
