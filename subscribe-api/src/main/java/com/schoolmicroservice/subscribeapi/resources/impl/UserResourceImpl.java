package com.schoolmicroservice.subscribeapi.resources.impl;

import com.schoolmicroservice.subscribeapi.domain.User;
import com.schoolmicroservice.subscribeapi.resources.UserResource;
import com.schoolmicroservice.subscribeapi.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/subscribes")
public class UserResourceImpl implements UserResource {

    private final UserService service;

    private final Environment env;

    @Override
    public ResponseEntity<User> findById(Long id) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + "port");
        return ResponseEntity.ok().body(service.findById(id));
    }

    @Override
    public ResponseEntity<User> createUser(User user) {
        return ResponseEntity.ok().body(service.createUser(user));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
}
