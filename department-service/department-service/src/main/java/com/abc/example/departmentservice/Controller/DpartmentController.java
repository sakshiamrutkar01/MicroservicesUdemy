package com.abc.example.departmentservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.example.departmentservice.Dto.DepartmentDto;
import com.abc.example.departmentservice.Service.DepartmentService;

@RestController
@RequestMapping("api/departments")
public class DpartmentController {
	@Autowired
	DepartmentService departmentService;
	
	 @PostMapping
	    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
	        DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
	        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
	    }

	    // Build get department rest api
	    @GetMapping("{department-code}")
	    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode){
	        DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
	        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
	    }

}
