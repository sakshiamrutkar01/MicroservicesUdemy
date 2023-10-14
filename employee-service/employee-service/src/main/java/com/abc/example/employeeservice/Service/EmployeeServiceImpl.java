package com.abc.example.employeeservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


import com.abc.example.employeeservice.Dto.ApiResponseDto;
import com.abc.example.employeeservice.Dto.DepartmentDto;
import com.abc.example.employeeservice.Dto.EmployeeDto;
import com.abc.example.employeeservice.Entity.Employee;
import com.abc.example.employeeservice.Mapper.EmployeeMapper;
import com.abc.example.employeeservice.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
//	@Autowired
//	priavte RestTemplate restTemplate;

//	@Autowired 
//	 private WebClient webClient;

	@Autowired
	private APIClient apiClient;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

		Employee saveDEmployee = employeeRepository.save(employee);

		EmployeeDto savedEmployeeDto = EmployeeMapper.mapToEmployeeDto(saveDEmployee);

		return savedEmployeeDto;
	}

	@Override
	public ApiResponseDto getEmployeeDtoByID(Long employeeId) {
		// TODO Auto-generated method stub

		Employee employee = employeeRepository.findById(employeeId).get();

//		ResponseEntity<DepartmentDto> responseEntity=restTemplate.getForEntity("http://localhost:8081/api/departments/"+employee.getDepartmentCode(),DepartmentDto.class);
//		DepartmentDto departmentDto = responseEntity.getBody();

//	  DepartmentDto departmentDto=  webClient.get().uri("http://localhost:8081/api/departments/"+employee.getDepartmentCode()).retrieve().bodyToMono(DepartmentDto.class).block();
//		

		ResponseEntity<DepartmentDto> responseEntity = apiClient.getDepartment(employee.getDepartmentCode());
		DepartmentDto departmentDto = responseEntity.getBody();
		EmployeeDto employeeDto = new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(),
				employee.getEmail(), employee.getDepartmentCode());

		ApiResponseDto apiResponseDto = new ApiResponseDto();
		apiResponseDto.setEmployeeDto(employeeDto);
		apiResponseDto.setDepartmentDto(departmentDto);
		return apiResponseDto;
	}

}
