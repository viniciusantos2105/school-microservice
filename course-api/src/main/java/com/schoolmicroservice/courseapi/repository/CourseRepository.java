package com.schoolmicroservice.courseapi.repository;

import com.schoolmicroservice.courseapi.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
