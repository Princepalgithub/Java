package com.user.service;

import java.util.List;

import com.user.model.Employee;

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
	void saveEmployee1(Employee employee);
}
