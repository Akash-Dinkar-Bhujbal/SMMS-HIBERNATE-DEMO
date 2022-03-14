package com.cg.smms.service;

import com.cg.smms.entities.Employee;

public interface IEmployeeService {
	
	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	Employee searchEmployee(long id);

	Boolean deleteEmployee(long id);
}
