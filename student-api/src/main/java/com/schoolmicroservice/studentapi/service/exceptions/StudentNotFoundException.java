package com.schoolmicroservice.studentapi.service.exceptions;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException() { super("Aluno não encontrado");
    }
}
