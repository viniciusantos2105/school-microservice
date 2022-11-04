package com.schoolmicroservice.subscribeapi.services.impl;

import com.schoolmicroservice.subscribeapi.domain.Person;
import com.schoolmicroservice.subscribeapi.feignClient.AddressFeign;
import com.schoolmicroservice.subscribeapi.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class PersonService {

    private final PersonRepository personRepository;

    private final Environment env;

    private final AddressFeign feign;

    public Person findById(Long id) {
        return personRepository.findById(id).orElseThrow();
    }


    public Person createUser(Person person) {
        var address = feign.searchAddress(person.getAddress()).getBody();
        person.setAddress(address);
        return personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
