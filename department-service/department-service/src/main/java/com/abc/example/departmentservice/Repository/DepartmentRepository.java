package com.abc.example.departmentservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.example.departmentservice.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentCode(String departmentCode);

}
