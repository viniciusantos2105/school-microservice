package com.schoolmicroservice.subscribeapi.services.exceptions;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException() { super("Usuario não encontrado");
    }
}
