package com.schoolmicroservice.subscribeapi.resources.impl;

import com.schoolmicroservice.subscribeapi.domain.Person;
import com.schoolmicroservice.subscribeapi.dto.PersonDTO;
import com.schoolmicroservice.subscribeapi.services.impl.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/subscribe")
public class PersonResource {

    private final PersonService service;

    private final Environment env;


    @GetMapping(value = "/findInscription")
    public ResponseEntity<Person> findById(@RequestBody PersonDTO personDTO) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + "port");
        return ResponseEntity.ok().body(service.findById(personDTO));
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Person> createUser(@RequestBody Person person) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + "port");
        return ResponseEntity.ok().body(service.createUser(person));
    }

    public ResponseEntity<List<Person>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
}
