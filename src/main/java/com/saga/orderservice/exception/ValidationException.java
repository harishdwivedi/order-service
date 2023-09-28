package com.saga.orderservice.exception;

public class ValidationException extends Exception {
    public ValidationException(String message) throws Exception {
        throw new Exception(message);
    }
}
