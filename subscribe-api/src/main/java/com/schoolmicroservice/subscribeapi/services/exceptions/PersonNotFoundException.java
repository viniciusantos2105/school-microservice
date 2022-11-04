package com.schoolmicroservice.subscribeapi.services.exceptions;

public class PersonNotFoundException extends RuntimeException{

    public PersonNotFoundException() { super("Usuario não encontrado");
    }
}
