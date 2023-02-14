package com.example.billy;

import java.util.ArrayList;

public class User {
    private float id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phone;

    public User(float id, String username, String firstname, String lastname, String email, String password, String phone) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
