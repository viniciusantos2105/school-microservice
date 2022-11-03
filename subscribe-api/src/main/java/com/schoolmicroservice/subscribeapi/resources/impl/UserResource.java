package com.schoolmicroservice.subscribeapi.resources.impl;

import com.schoolmicroservice.subscribeapi.domain.Usuario;
import com.schoolmicroservice.subscribeapi.services.impl.UserService;
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
public class UserResource {

    private final UserService service;

    private final Environment env;


    public ResponseEntity<Usuario> findById(Long id) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + "port");
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + "port");
        return ResponseEntity.ok().body(service.createUser(usuario));
    }

    public ResponseEntity<List<Usuario>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
}
