package com.cg.smms.application;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Shop;
import com.cg.smms.repository.EmployeeRepository;
import com.cg.smms.repository.IEmployeeRepository;
import com.cg.smms.repository.IShopRepository;
import com.cg.smms.repository.ShopRepository;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		IEmployeeRepository serviceEmp = new EmployeeRepository();
		IShopRepository serviceShop = new ShopRepository();
//		emp.setId(500);
		emp.setName("John");
		emp.setSalary(10000);
		emp.setAddress("Delhi");
		emp.setDesignation("Worker");
		Shop shop = serviceShop.searchShopById(100);
		emp.setShop_id(shop);
	}

}
