package com.cg.smms.repository;

import com.cg.smms.entities.Customer;

public interface ICustomerRepository {
	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	Customer searchCustomer(long id);

	boolean deleteCustomer(long id);

	void beginTransaction();

	void commitTransaction();
}
