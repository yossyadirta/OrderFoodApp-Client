package com.example.yossy.orderfood.Model;

public class User{
    private String NoMeja;
    private String Password;

    public User() {
    }

    public User(String noMeja, String password) {
        NoMeja = noMeja;
        Password = password;
    }

    public String getNoMeja() {
        return NoMeja;
    }

    public void setNoMeja(String noMeja) {
        NoMeja = noMeja;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
