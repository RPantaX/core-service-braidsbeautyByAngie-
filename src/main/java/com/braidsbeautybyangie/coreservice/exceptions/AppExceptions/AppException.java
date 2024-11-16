package com.braidsbeautybyangie.coreservice.exceptions.AppExceptions;

public class AppException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String message;
    public AppException(String message) {
        super(message);
        this.message = message;
    }
    public AppException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
