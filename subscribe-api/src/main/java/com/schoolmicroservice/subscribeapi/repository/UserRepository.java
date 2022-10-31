package com.schoolmicroservice.subscribeapi.repository;

import com.schoolmicroservice.subscribeapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
