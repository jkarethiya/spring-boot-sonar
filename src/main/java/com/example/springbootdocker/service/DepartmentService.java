package com.example.springbootdocker.service;

// Importing required classes
import java.util.List;

import com.example.springbootdocker.model.Department;

// Interface
public interface DepartmentService {

	// Save operation
	Department saveDepartment(Department department);

	// Read operation
	List<Department> fetchDepartmentList();

	// Update operation
	Department updateDepartment(Department department, Long departmentId);

	// Delete operation
	void deleteDepartmentById(Long departmentId);

	Department findById(Long id);
}