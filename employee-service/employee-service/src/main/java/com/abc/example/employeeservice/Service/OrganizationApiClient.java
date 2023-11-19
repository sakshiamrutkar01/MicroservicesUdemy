package com.abc.example.employeeservice.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abc.example.employeeservice.Dto.OrganizationDto;





//@FeignClient(url="http://localhost:8083/",name = "ORGANIZATION-SERVICE")
@FeignClient(name = "ORGANIZATION-SERVICE")
public interface OrganizationApiClient {

    @GetMapping("/api/organizations/{organization-code}")
    ResponseEntity<OrganizationDto> getOrganization(@PathVariable("organization-code") String organizationCode);
}

