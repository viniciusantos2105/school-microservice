package com.schoolmicroservice.studentapi.resource;

import com.schoolmicroservice.studentapi.domain.Course;
import com.schoolmicroservice.studentapi.domain.Student;
import com.schoolmicroservice.studentapi.dto.InscriptionDTO;
import com.schoolmicroservice.studentapi.dto.PersonDTO;
import com.schoolmicroservice.studentapi.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/student")
public class StudentResource {

    private final StudentService service;

    @PostMapping(value = "/create")
    public ResponseEntity<Student> createStudent(@RequestBody PersonDTO personDTO){
        return ResponseEntity.ok().body(service.createStudent(personDTO));
    }

    @PostMapping(value = "/addCourses")
    public ResponseEntity<Student> addCourses(@RequestBody InscriptionDTO inscriptionDTO){
        return ResponseEntity.ok().body(service.addCourses(inscriptionDTO));
    }

    @GetMapping(value = "/findStudent")
    public ResponseEntity<Student> findStudent(@RequestBody InscriptionDTO inscriptionDTO){
        return ResponseEntity.ok().body(service.getStudent(inscriptionDTO.getStudentId()));
    }
}
