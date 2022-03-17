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
		employee = EmployeeDAO.addEmployee(employee);
		EmployeeDAO.commitTransaction();
		System.out.println("1Employee created");
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
	public Employee searchEmployee(int id) {
		Employee employee = EmployeeDAO.searchEmployee(id);
		return employee;
	}

//	deleteEmployee
	@Override
	public boolean deleteEmployee(int id) {
		EmployeeDAO.beginTransaction();
		EmployeeDAO.deleteEmployee(id);
		EmployeeDAO.commitTransaction();
		return true;
	}

}
