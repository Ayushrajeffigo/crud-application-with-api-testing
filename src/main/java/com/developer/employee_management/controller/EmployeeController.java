package com.developer.employee_management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.developer.employee_management.entity.EmployeeEntity;
import com.developer.employee_management.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	private final EmployeeService employeeService;
	public EmployeeController(EmployeeService employeeService)
	{
		super();
		this.employeeService = employeeService;
		
	}
	@GetMapping
	public List<EmployeeEntity> findAllEmployee()
	{
		return employeeService.findAllEmployee();
		
	}
//	chech once here Id or id
	@GetMapping("/{id}")
	public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id")long id){
		return employeeService.findById(id);
		
	}
	@PostMapping
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity)
	{
		return employeeService.saveEmployee(employeeEntity);
		
	}
	@PutMapping
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity)
	{
		return employeeService.updateEmployee(employeeEntity);
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") long id)
	{
		employeeService.deleteEmployee(id);
	}
	

}
