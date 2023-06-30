package com.icodeap.tradekeeper.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String userId;
    @Column(name = "username")
    public String username;
    @Column(name = "password")
    public String password;
    @Column(name = "registered")
    public String registered;

    public User(String userId, String username, String password, String registered) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.registered = registered;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
