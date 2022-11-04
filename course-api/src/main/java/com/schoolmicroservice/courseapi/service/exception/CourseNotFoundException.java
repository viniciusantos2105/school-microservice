package com.schoolmicroservice.courseapi.service.exception;

public class CourseNotFoundException extends RuntimeException{

    public CourseNotFoundException() { super("Matéria não encontrada");
    }
}
