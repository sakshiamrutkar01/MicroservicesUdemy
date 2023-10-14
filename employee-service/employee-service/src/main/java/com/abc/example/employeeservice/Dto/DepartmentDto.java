package com.abc.example.employeeservice.Dto;

public class DepartmentDto {

	private String id;
	private String departmentName;

	public DepartmentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentDto(String id, String departmentName, String departmentDescription,
			String departmentCode) {
		super();
		this.id = id ;
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
		this.departmentCode = departmentCode;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	private String departmentDescription;
	private String departmentCode;
}
