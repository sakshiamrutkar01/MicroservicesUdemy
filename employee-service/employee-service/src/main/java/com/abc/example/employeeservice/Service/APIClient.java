package com.abc.example.employeeservice.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abc.example.employeeservice.Dto.DepartmentDto;



//@FeignClient(url="http://localhost:8081",value="DEPARTMENT-SERVICE")
@FeignClient(name="DEPARTMENT-SERVICE")
public interface APIClient {

	@GetMapping("api/departments/{department-code}")
	    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode);
}
