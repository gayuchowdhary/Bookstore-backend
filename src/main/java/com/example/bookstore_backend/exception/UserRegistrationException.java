package com.example.bookstore_backend.exception;

public class UserRegistrationException  extends  RuntimeException{
    public UserRegistrationException(String message)
    {
        super(message);
    }
}

