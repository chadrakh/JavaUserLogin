package com.application.userlogin.domain;

public class User {
    private final String USERNAME;
    private final String PASSWORD;
    private UserType type;

    public User(String username, String password) {
        this.USERNAME = username;
        this.PASSWORD = password;
    }

    public User(String username, String password, UserType type) {
        this.USERNAME = username;
        this.PASSWORD = password;
        this.type = type;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public UserType getType() {
        return type;
    }
}
