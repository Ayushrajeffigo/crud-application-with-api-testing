package com.developer.employee_management.service;

import java.util.List;
import java.util.Optional;

import com.developer.employee_management.entity.EmployeeEntity;

public interface EmployeeService {
	List<EmployeeEntity> findAllEmployee();
	EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
	void deleteEmployee(long id);
	Optional<EmployeeEntity> findById(long id);

}
