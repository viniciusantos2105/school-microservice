package com.schoolmicroservice.subscribeapi.repository;

import com.schoolmicroservice.subscribeapi.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
