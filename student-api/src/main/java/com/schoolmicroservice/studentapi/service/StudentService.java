package com.schoolmicroservice.studentapi.service;

import com.schoolmicroservice.studentapi.domain.Person;
import com.schoolmicroservice.studentapi.domain.Student;
import com.schoolmicroservice.studentapi.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository repository;

    private Student createStudent(Person person){


    }
}
