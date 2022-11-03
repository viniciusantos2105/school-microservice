package com.schoolmicroservice.subscribeapi.services.impl;

import com.schoolmicroservice.subscribeapi.domain.Usuario;
import com.schoolmicroservice.subscribeapi.repository.UserRepository;
import com.schoolmicroservice.subscribeapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Usuario findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public Usuario createUser(Usuario usuario) {
        return userRepository.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return userRepository.findAll();
    }
}
