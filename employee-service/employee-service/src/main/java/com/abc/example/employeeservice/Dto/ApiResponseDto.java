package com.abc.example.employeeservice.Dto;

public class ApiResponseDto {
	private EmployeeDto employeeDto;
	private  DepartmentDto departmentDto;
	private OrganizationDto organizationDto;
	public OrganizationDto getOrganizationDto() {
		return organizationDto;
	}
	public void setOrganizationDto(OrganizationDto organizationDto) {
		this.organizationDto = organizationDto;
	}
	public EmployeeDto getEmployeeDto() {
		return employeeDto;
	}
	public ApiResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiResponseDto(EmployeeDto employeeDto, DepartmentDto departmentDto, OrganizationDto organizationDto) {
		super();
		this.employeeDto = employeeDto;
		this.departmentDto = departmentDto;
		this.organizationDto = organizationDto;
	}
	
	public void setEmployeeDto(EmployeeDto employeeDto) {
		this.employeeDto = employeeDto;
	}
	public DepartmentDto getDepartmentDto() {
		return departmentDto;
	}
	public void setDepartmentDto(DepartmentDto departmentDto) {
		this.departmentDto = departmentDto;
	}

	
}
