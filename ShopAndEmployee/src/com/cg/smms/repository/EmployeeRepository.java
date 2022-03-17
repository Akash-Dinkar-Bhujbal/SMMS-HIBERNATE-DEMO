package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Employee;

public class EmployeeRepository implements IEmployeeRepository {
	private EntityManager entityManager;

//	Constructor
	public EmployeeRepository() {
		entityManager = JPAUtil.getEntityManager();
	}

//	addEmployee
	@Override
	public Employee addEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}

//	updateEmployee
	@Override
	public Employee updateEmployee(Employee employee) {
		entityManager.merge(employee);
		return employee;
	}

//	searchEmployee
	@Override
	public Employee searchEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

//	deleteEmployee
	@Override
	public boolean deleteEmployee(int id) {
		entityManager.remove(searchEmployee(id));
		return true;
	}

//	beginTransaction
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

//	commitTransaction
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	

}
