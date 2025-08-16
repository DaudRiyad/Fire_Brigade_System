package com.example.fire_brigade_system.Models;


public class User {
    private String userId;
    private String password;
    private String phone;
    private String role; // Add this

    public User(String userId, String password, String phone, String role) {
        this.userId = userId;
        this.password = password;
        this.phone = phone;
        this.role = role;
    }

    public String getUserId() { return userId; }
    public String getPassword() { return password; }
    public String getPhone() { return phone; }
    public String getRole() { return role; }
    public void setPassword(String password) { this.password = password; }
}

