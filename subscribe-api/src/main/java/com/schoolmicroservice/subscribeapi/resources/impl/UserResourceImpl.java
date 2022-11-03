package com.schoolmicroservice.subscribeapi.resources.impl;

import com.schoolmicroservice.subscribeapi.domain.Usuario;
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
    public ResponseEntity<Usuario> findById(Long id) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + "port");
        return ResponseEntity.ok().body(service.findById(id));
    }

    @Override
    public ResponseEntity<Usuario> createUser(Usuario usuario) {
        return ResponseEntity.ok().body(service.createUser(usuario));
    }

    @Override
    public ResponseEntity<List<Usuario>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
}
