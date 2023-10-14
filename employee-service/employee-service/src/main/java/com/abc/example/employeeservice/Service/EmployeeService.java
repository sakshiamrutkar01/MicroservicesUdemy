package com.abc.example.employeeservice.Service;

import org.springframework.stereotype.Service;

import com.abc.example.employeeservice.Dto.ApiResponseDto;
import com.abc.example.employeeservice.Dto.EmployeeDto;

@Service
public interface EmployeeService  {

	EmployeeDto saveEmployee(EmployeeDto employeeDto);

	ApiResponseDto getEmployeeDtoByID(Long employeeId);
}
