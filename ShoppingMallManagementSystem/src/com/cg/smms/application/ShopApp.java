package com.cg.smms.application;

import java.time.LocalDate;

import com.cg.smms.entities.*;
import com.cg.smms.repository.*;
import com.cg.smms.service.*;

public class ShopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Entity Object creation
		Shop shop = new Shop();
		ShopOwner shopOwner = new ShopOwner();
//		Employee employee = new Employee();

//		Service Object creation for Operational part:CRUD Operation
		IShopService serviceShop = new ShopService();
//		IShopOwnerSE serviceShopOwner = new ShopOwnerRepository();
//		IEmployeeRepository serviceEmployee = new EmployeeRepository();

		/* Create Operation */
		shop.setShopId(100);
		shop.setShopCategory("Food");
		shop.setShopName("KFC");
		shop.setShopStatus("Open");
		shop.setLeaseStatus("Paid");

//		employee.setId(5001);
//		employee.setName("Raju");
//		employee.setDob(LocalDate.of(2000, 28, 12));
//		employee.setSalary(10000);
//		employee.setDesignation("Worker");
//		employee.setShop_id(shop);
//
//		shop.setEmployees(employee);

		shopOwner.setShopOwnerId(10);
		shopOwner.setName("Sham");
		shopOwner.setDob(LocalDate.of(1990, 10, 10));//
		shopOwner.setAddress("A10, Mumbai");

//		serviceEmployee.addEmployee(employee);
		serviceShop.addShopOwner(shopOwner);
		serviceShop.addShop(shop);// <---------------

//		shop = serviceShop.searchShopById(100);

	}

}
