package com.abc.example.employeeservice.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abc.example.employeeservice.Dto.DepartmentDto;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;



//@FeignClient(url="http://localhost:8081",value="DEPARTMENT-SERVICE")
@FeignClient(name="DEPARTMENT-SERVICE")
public interface APIClient {

	
	//@CircuitBreaker( name = "DEPARTMENT-SERVICE", fallbackMethod="getDepartmentByCodeFallback")
	//@Retry( name = "DEPARTMENT-SERVICE", fallbackMethod="getDepartmentByCodeFallback")
	@GetMapping("api/departments/{department-code}")
	    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode);
	
//	 default DepartmentDto getDepartmentByCodeFallback(String code, Throwable exception) {
//	        System.out.println("Param: " + code);
//	        System.out.println(exception.getLocalizedMessage());
//	        return new DepartmentDto("R&D", "R&D department", "RD13");
//	    }
}
