package com.schoolmicroservice.studentapi.service;

import com.schoolmicroservice.studentapi.domain.Course;
import com.schoolmicroservice.studentapi.domain.Student;
import com.schoolmicroservice.studentapi.dto.InscriptionDTO;
import com.schoolmicroservice.studentapi.dto.PersonDTO;
import com.schoolmicroservice.studentapi.feignClients.CourseFeign;
import com.schoolmicroservice.studentapi.feignClients.PersonFeign;
import com.schoolmicroservice.studentapi.repository.StudentRepository;
import com.schoolmicroservice.studentapi.service.exceptions.StudentNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository repository;

    private final PersonFeign personFeign;

    private final CourseFeign courseFeign;

    public Student createStudent(PersonDTO personDTO){
        var person = personFeign.findInscription(personDTO).getBody();
        Student student = new Student();
        student.setId(null);
        student.setPerson(person);
        student.setCourseList(new ArrayList<>());
        return repository.save(student);
    }

    public Student addCourses(InscriptionDTO inscriptionDTO){
        Course course = courseFeign.findCourse(inscriptionDTO.getCourseId()).getBody();
        Student student = repository.findById(inscriptionDTO.getStudentId()).orElseThrow(()-> new StudentNotFoundException());
        student.getCourseList().add(course);
        repository.save(student);
        return student;
    }

    public Student getStudent(Long id){
        return repository.findById(id).get();
    }
}
