package com.schoolmicroservice.courseapi.service;

import com.schoolmicroservice.courseapi.domain.Course;

import java.util.List;

public interface CourseService {

    Course create(Course course);

    Course findById(Long id);

    String deleteCourse(Course course);

    List<Course> listAll();

}
