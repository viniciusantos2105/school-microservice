package com.schoolmicroservice.addressapi.resource.impl;

import com.schoolmicroservice.addressapi.domain.Address;
import com.schoolmicroservice.addressapi.resource.AddressResource;
import com.schoolmicroservice.addressapi.services.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/address")
public class AddressResourceImpl implements AddressResource {

    private final AddressService service;


    @Override
    public ResponseEntity<Address> searchAddress(Address address) {
        return ResponseEntity.ok().body(service.createAddress(address));
    }
}
