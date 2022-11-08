package com.schoolmicroservice.studentapi.feignClients;

import com.schoolmicroservice.studentapi.domain.Course;
import com.schoolmicroservice.studentapi.domain.Person;
import com.schoolmicroservice.studentapi.dto.PersonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "course-api")
public interface CourseFeign {

    @GetMapping(value = "api/course/findById")
    ResponseEntity<Person> findCourse(@RequestBody Course course);
}
