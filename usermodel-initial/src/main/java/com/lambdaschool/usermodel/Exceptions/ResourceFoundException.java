package com.lambdaschool.usermodel.Exceptions;

public class ResourceFoundException extends RuntimeException{
    public ResourceFoundException(String message) {
        super("Error from my application " + message);
    }
}
