package com.schoolmicroservice.subscribeapi.resources;

import com.schoolmicroservice.subscribeapi.domain.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserResource {

    @GetMapping(value = "/{id}")
    ResponseEntity<Usuario> findById(@PathVariable Long id);

    @PostMapping("/create")
    ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario);

    @GetMapping
    ResponseEntity<List<Usuario>> findAll();
}
