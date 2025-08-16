package com.tnsif.OneToManyMapping.exception;

public class CustomerNotFoundException extends RuntimeException {
  
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
