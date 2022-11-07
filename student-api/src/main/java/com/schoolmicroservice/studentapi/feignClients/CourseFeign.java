package com.schoolmicroservice.studentapi.feignClients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "course-api")
public interface CourseFeign {
}
