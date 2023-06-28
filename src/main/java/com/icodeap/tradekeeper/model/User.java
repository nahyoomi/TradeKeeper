package com.icodeap.tradekeeper.model;

public class User {
    public String username;
    public String password;
    public String registered;

    public User(String username, String password, String registered) {
        this.username = username;
        this.password = password;
        this.registered = registered;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }
}
