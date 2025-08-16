package com.tnsif.OneToManyMapping.exception;

public class OrderNotFoundException extends RuntimeException {
    // Constructor accepting a custom message
    public OrderNotFoundException(String message) {
        super(message);
    }
}