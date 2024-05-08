package com.ucb.producto.dto;

public class LoginResponse {
    private String token;
    private String timestamp;
    public LoginResponse(String token, String timestamp) {
        this.token = token;
        this.timestamp = timestamp;
    }

    public String getToken() {
        return token;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}

