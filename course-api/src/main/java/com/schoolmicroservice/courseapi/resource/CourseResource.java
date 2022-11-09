package com.schoolmicroservice.courseapi.resource;

import com.schoolmicroservice.courseapi.domain.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CourseResource {

    @PostMapping(value = "/create")
    ResponseEntity<Course> createCourse(@RequestBody Course course);

    @PostMapping(value = "/findById")
    ResponseEntity<Course> findById(@RequestBody Long id);

    @DeleteMapping(value = "/delete")
    ResponseEntity<String> delete(@RequestBody Course course);

    @GetMapping(value = "/listAll")
    ResponseEntity<List<Course>> listAll();
}
