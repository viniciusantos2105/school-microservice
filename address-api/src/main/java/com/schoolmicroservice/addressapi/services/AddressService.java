package com.schoolmicroservice.addressapi.services;

import com.schoolmicroservice.addressapi.domain.Address;

import java.util.List;

public interface AddressService {

    Address findById(Long id);

    Address createAddress(Address address);

    String findAddressByCep(String cep);

    List<String> address(String json);

    List<String> splitAddress(List<String> list);
}
