package com.cg.smms.application;

import java.time.LocalDate;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Shop;
import com.cg.smms.service.EmployeeService;
import com.cg.smms.service.IEmployeeService;
import com.cg.smms.service.IShopService;
import com.cg.smms.service.ShopService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		IShopService serviceShop = new ShopService();

		Employee emp = new Employee();
		IEmployeeService serviceEmp = new EmployeeService();

		/* Create Operation */
		shop.setShopId(100);
		shop.setShopCategory("Food");
		shop.setShopName("KFC");
		shop.setShopStatus("Open");
		shop.setLeaseStatus("Paid");


		/* search */

//		shop = serviceShop.searchShopById(100);
//		System.out.println("ShopId : " + shop.getShopId());
//		System.out.println("ShopName : " + shop.getShopName());

		/* update */
//		shop = serviceShop.searchShopById(100);
//		shop.setShopName("PizzaHut");
//		serviceShop.updateShop(shop);

		/* remove */
//		serviceShop.deleteShop(100);

//		Create
		emp.setEmpId(504);
		emp.setName("John");
		emp.setDob(LocalDate.of(2000, 1, 1));
		emp.setSalary(10000);
		emp.setAddress("Delhi");
		emp.setDesignation("Worker");
//		serviceEmp.addEmployee(emp);
		
		shop.setEmployee(emp);
		serviceShop.addShop(shop);// <---------------
//
////		search
//
//		emp = serviceEmp.searchEmployee(505);
//		System.out.println("ID:" + emp.getId());
//		System.out.println("Name:" + emp.getName());

//		update

//		emp = serviceEmp.searchEmployee(501);
//		emp.setName("Sachin");
//		serviceEmp.updateEmployee(emp);

//		delete
//		serviceEmp.deleteEmployee(504);
//		System.out.println("504 Emp deleted");
	}

}
