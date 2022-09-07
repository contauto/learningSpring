package com.example.learningSpring.error;

import lombok.Data;

import java.util.Map;

@Data
public class ApiError {
    private int status;
    private String message;
    private String path;
    private long timeStamp;
    private Map<String,String> validationErrors;

    public ApiError(int status, String message, String path) {
        this.status = status;
        this.message = message;
        this.path = path;
    }
}
