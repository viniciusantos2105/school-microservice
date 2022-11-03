package com.schoolmicroservice.addressapi.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AddressResource {

    @PostMapping("/address")
    ResponseEntity<String> searchAddress(@RequestBody String cep);
}
