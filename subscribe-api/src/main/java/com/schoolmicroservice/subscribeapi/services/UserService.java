package com.schoolmicroservice.subscribeapi.services;

import com.schoolmicroservice.subscribeapi.domain.Usuario;

import java.util.List;

public interface UserService {

    Usuario findById(Long id);

    Usuario createUser(Usuario usuario);

    List<Usuario> findAll();
}
