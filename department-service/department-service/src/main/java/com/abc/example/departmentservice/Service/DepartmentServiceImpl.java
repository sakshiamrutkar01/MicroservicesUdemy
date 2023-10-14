package com.abc.example.departmentservice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.example.departmentservice.Dto.DepartmentDto;
import com.abc.example.departmentservice.Entity.Department;
import com.abc.example.departmentservice.Mapper.DepartmentMapper;
import com.abc.example.departmentservice.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	 @Override
	    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

	        // convert department dto to department jpa entity
	        Department department = DepartmentMapper.mapToDepartment(departmentDto);

	        Department savedDepartment = departmentRepository.save(department);

	        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);

	        return savedDepartmentDto;
	    }

	    @Override
	    public DepartmentDto getDepartmentByCode(String departmentCode) {

	        Department department = departmentRepository.findByDepartmentCode(departmentCode);

	        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);

	        return departmentDto;
	    }

}
