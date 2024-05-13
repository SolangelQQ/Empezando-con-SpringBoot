package com.ucb.producto.dto;

public class LoginRequestDto {
    private String email;
    private String password;
    public LoginRequestDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String password) {
        this.password = password;
    }

}