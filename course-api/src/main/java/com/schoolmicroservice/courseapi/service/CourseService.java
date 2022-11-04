package com.schoolmicroservice.courseapi.service;

import com.schoolmicroservice.courseapi.domain.Course;

import java.util.List;

public interface CourseService {

    Course create(Course course);

    Course findById(Course course);

    String deleteCourse(Course course);

    List<Course> listAll();

}
