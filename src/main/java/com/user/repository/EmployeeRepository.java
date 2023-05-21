package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}