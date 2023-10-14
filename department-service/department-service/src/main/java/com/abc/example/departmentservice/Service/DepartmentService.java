package com.abc.example.departmentservice.Service;

import java.util.List;
import java.util.Optional;

import com.abc.example.departmentservice.Dto.DepartmentDto;
import com.abc.example.departmentservice.Entity.Department;

public interface DepartmentService {

	 DepartmentDto saveDepartment(DepartmentDto departmentDto);

	    DepartmentDto getDepartmentByCode(String code);
}
