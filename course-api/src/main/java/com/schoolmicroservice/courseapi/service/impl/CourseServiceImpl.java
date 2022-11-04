package com.schoolmicroservice.courseapi.service.impl;

import com.schoolmicroservice.courseapi.domain.Course;
import com.schoolmicroservice.courseapi.repository.CourseRepository;
import com.schoolmicroservice.courseapi.service.CourseService;
import com.schoolmicroservice.courseapi.service.exception.CourseNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;

    @Override
    public Course create(Course course) {
        return repository.save(course);
    }

    @Override
    public Course findById(Course id) {
        return repository.findById(id.getId()).orElseThrow(()-> new CourseNotFoundException());
    }

    @Override
    public String deleteCourse(Course id) {
        Course course = repository.findById(id.getId()).orElseThrow(()-> new CourseNotFoundException());
        repository.deleteById(id.getId());
        return "Matéria deletada com sucesso";
    }

    @Override
    public List<Course> listAll() {
        return repository.findAll();
    }
}
