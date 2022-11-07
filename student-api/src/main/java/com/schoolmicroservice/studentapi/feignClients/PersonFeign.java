package com.schoolmicroservice.studentapi.feignClients;

import com.schoolmicroservice.studentapi.domain.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "subscribe-api")
public interface PersonFeign {

    @PostMapping(value = "api/address/search")
    ResponseEntity<Person> searchAddress(@RequestBody Person person);
}
