package com.schoolmicroservice.addressapi.services.exception;

public class AddressNotFoundException extends RuntimeException{

    public AddressNotFoundException() { super("Endereço não encontrado");
    }
}
