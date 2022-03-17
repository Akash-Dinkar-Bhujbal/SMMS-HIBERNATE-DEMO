package com.cg.smms.repository;

import com.cg.smms.entities.Employee;

public interface IEmployeeRepository {

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	Employee searchEmployee(int id);

	boolean deleteEmployee(int id);

	void beginTransaction();

	void commitTransaction();

}
