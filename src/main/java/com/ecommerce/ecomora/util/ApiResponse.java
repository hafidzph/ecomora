package com.ecommerce.ecomora.util;

public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private String error;

    public ApiResponse(String message, T data) {
        this.success = true;
        this.message = message;
        this.data = data;
        this.error = null;
    }

    public ApiResponse(String message, String error) {
        this.success = false;
        this.message = message;
        this.data = null;
        this.error = error;
    }

    // Getters & Setters
    // ...
}
