package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.repository.EmployeeRepository;
import com.cg.smms.repository.IEmployeeRepository;

public class EmployeeService implements IEmployeeService {
	private IEmployeeRepository EmployeeDAO;

//	Constructor
	public EmployeeService() {
		EmployeeDAO = new EmployeeRepository();
	}

//	addEmployee
	@Override
	public Employee addEmployee(Employee employee) {
		EmployeeDAO.beginTransaction();
		EmployeeDAO.addEmployee(employee);
		EmployeeDAO.commitTransaction();
		return employee;
	}

//	updateEmployee
	@Override
	public Employee updateEmployee(Employee employee) {
		EmployeeDAO.beginTransaction();
		EmployeeDAO.updateEmployee(employee);
		EmployeeDAO.commitTransaction();
		return employee;
	}

//	searchEmployee
	@Override
	public Employee searchEmployee(long id) {
		Employee employee = EmployeeDAO.searchEmployee(id);
		return employee;
	}

//	deleteEmployee
	@Override
	public Boolean deleteEmployee(long id) {
		EmployeeDAO.beginTransaction();
		EmployeeDAO.deleteEmployee(id);
		EmployeeDAO.commitTransaction();
		return true;
	}

}
