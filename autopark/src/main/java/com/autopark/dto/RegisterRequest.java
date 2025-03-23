package com.autopark.dto;

public class RegisterRequest {

    private String name;
    private String email;
    private String username;
    private String password;
    private String role;

    public RegisterRequest(){

    }

    public RegisterRequest(String name, String email, String username,
                           String password, String role) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public RegisterRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RegisterRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public RegisterRequest setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegisterRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getRole() {
        return role;
    }

    public RegisterRequest setRole(String role) {
        this.role = role;
        return this;
    }
}
