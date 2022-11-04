package com.schoolmicroservice.courseapi.resource.impl;

import com.schoolmicroservice.courseapi.domain.Course;
import com.schoolmicroservice.courseapi.resource.CourseResource;
import com.schoolmicroservice.courseapi.service.CourseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/course")
public class CourseResourceImpl implements CourseResource {

    private final CourseService service;


    @Override
    public ResponseEntity<Course> createCourse(Course course) {
        return ResponseEntity.ok().body(service.create(course));
    }

    @Override
    public ResponseEntity<Course> findById(String id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @Override
    public ResponseEntity<String> delete(String id) {
        return ResponseEntity.ok().body(service.deleteCourse(id));
    }

    @Override
    public ResponseEntity<List<Course>> listAll() {
        return ResponseEntity.ok().body(service.listAll());
    }
}
