package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Customer;

public class CustomerRepository implements ICustomerRepository {
	private EntityManager entityManager;

//	Constructor
	public CustomerRepository() {
		entityManager = JPAUtil.getEntityManager();
	}

//	addCustomer
	@Override
	public Customer addCustomer(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

//	updateCustomer
	@Override
	public Customer updateCustomer(Customer customer) {
		entityManager.merge(customer);
		return customer;
	}

//	searchCustomer
	@Override
	public Customer searchCustomer(long id) {
		Customer customer = entityManager.find(Customer.class, id);
		return customer;
	}

//	deleteCustomer
	@Override
	public boolean deleteCustomer(long id) {
		// TODO Auto-generated method stub
		entityManager.remove(searchCustomer(id));
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
