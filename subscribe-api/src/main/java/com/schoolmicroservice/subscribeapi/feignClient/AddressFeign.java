package com.schoolmicroservice.subscribeapi.feignClient;

import com.schoolmicroservice.subscribeapi.domain.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "address-api")
public interface AddressFeign {

    @PostMapping(value = "api/address/search")
    ResponseEntity<Address> searchAddress(@RequestBody Address address);
}
