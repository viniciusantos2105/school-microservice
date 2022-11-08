package com.schoolmicroservice.studentapi.service;

import com.schoolmicroservice.studentapi.domain.Course;
import com.schoolmicroservice.studentapi.domain.Student;
import com.schoolmicroservice.studentapi.dto.PersonDTO;
import com.schoolmicroservice.studentapi.dto.StudentDTO;
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

    public Student addCourses(Course course, StudentDTO studentDTO){
        var matter = courseFeign.findCourse(course).getBody();
        Student student = repository.findById(studentDTO.getId()).orElseThrow(()-> new StudentNotFoundException());
        student.getCourseList().add(course);
        return repository.save(student);
    }
}
