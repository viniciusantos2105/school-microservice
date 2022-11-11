package com.schoolmicroservice.courseapi.service;

import com.schoolmicroservice.courseapi.domain.Course;
import com.schoolmicroservice.courseapi.repository.CourseRepository;
import com.schoolmicroservice.courseapi.service.impl.CourseServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;


@SpringBootTest
public class CourseServiceTest  {

    public static final Long ID = 1L;

    private Course course;

    private Course mockCourse;

    @InjectMocks
    private CourseServiceImpl courseService;

    @Mock
    private CourseRepository repository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        startCourse();
    }

    @Test
    public void whenCreateCourseThenReturnSuccess(){
        when(repository.save(any())).thenReturn(mockCourse);

        Course response = courseService.create(course);

        Assertions.assertNotNull(response);
    }

    public void startCourse(){
        course = new Course(ID, "Introdução a programação", "19:00", "22:00", 99.00);
        mockCourse = new Course(ID, "Introdução a programação", "19:00", "22:00", 99.00);
    }
}
