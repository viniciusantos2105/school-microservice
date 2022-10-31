package com.schoolmicroservice.subscribeapi.services;

import com.schoolmicroservice.subscribeapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    User createUser(User user);

    List<User> findAll();
}
