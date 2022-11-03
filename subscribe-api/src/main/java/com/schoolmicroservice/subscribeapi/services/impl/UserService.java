package com.schoolmicroservice.subscribeapi.services.impl;

import com.schoolmicroservice.subscribeapi.domain.Usuario;
import com.schoolmicroservice.subscribeapi.feignClient.AddressFeign;
import com.schoolmicroservice.subscribeapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;

    private final Environment env;

    private final AddressFeign feign;

    public Usuario findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }


    public Usuario createUser(Usuario usuario) {
        var address = feign.searchAddress(usuario.getAddress()).getBody();
        usuario.setAddress(address);
        return userRepository.save(usuario);
    }

    public List<Usuario> findAll() {
        return userRepository.findAll();
    }
}
