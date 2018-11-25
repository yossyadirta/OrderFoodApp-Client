package com.example.yossy.orderfood.Model;

public class User{
    private String NoMeja;
    private String Password;
    private String IsAdmin;

    public User() {
    }

    public User(String noMeja, String password) {
        NoMeja = noMeja;
        Password = password;

        //User will get status
        IsAdmin="false";
    }

    public String getIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        IsAdmin = isAdmin;
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
