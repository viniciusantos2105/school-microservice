package com.schoolmicroservice.subscribeapi.services.impl;

import com.schoolmicroservice.subscribeapi.domain.User;
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
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
