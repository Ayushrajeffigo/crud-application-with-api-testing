package com.developer.employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developer.employee_management.entity.EmployeeEntity;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
