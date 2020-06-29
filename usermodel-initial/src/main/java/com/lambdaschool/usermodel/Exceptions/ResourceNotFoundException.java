package com.lambdaschool.usermodel.Exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super("Error from my application" + message);
    }
}
