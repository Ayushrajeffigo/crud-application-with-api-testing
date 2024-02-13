package com.developer.employee_management.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.employee_management.entity.EmployeeEntity;
import com.developer.employee_management.repository.EmployeeRepository;
import com.developer.employee_management.service.EmployeeService;

@Service
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	private final EmployeeRepository employeeRepository;
	public  EmployeeServiceimpl(EmployeeRepository employeeRepository)
	{
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<EmployeeEntity> findAllEmployee() {
		return employeeRepository.findAll();
	}
	@Override
	public Optional<EmployeeEntity> findById(long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employeeEntity);
	}

//	@Override
//	public void deleteEmployee(Long id) {
//		// TODO Auto-generated method stub
//		employeeRepository.deleteById(id);
//	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		
	}
	

}
