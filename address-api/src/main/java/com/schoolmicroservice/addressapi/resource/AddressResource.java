package com.schoolmicroservice.addressapi.resource;

import com.schoolmicroservice.addressapi.domain.Address;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AddressResource {

    @PostMapping(value = "/search")
    ResponseEntity<Address> searchAddress(@RequestBody Address address);
}
