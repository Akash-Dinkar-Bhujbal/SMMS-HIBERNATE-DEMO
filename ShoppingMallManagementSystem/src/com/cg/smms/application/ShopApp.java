package com.cg.smms.application;

import java.time.LocalDate;

import com.cg.smms.entities.Shop;
import com.cg.smms.entities.ShopOwner;
import com.cg.smms.repository.IShopOwnerRepository;
import com.cg.smms.repository.ShopOwnerRepository;
import com.cg.smms.service.IShopService;
import com.cg.smms.service.ShopService;

public class ShopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Entity Object creation
		Shop shop = new Shop();
		ShopOwner shopOwner = new ShopOwner();
//		Employee employee = new Employee();

//		Service Object creation for Operational part:CRUD Operation
		IShopService serviceShop = new ShopService();
		IShopOwnerRepository serviceShopOwner = new ShopOwnerRepository();
//		IEmployeeRepository serviceEmployee = new EmployeeRepository();

		/* Create Operation */
		shop.setShopId(100);
		shop.setShopCategory("Food");
		shop.setShopName("KFC");
		shop.setShopStatus("Open");

//		employee.setId(5001);
//		employee.setName("Raju");
//		employee.setDob(LocalDate.of(2000, 28, 12));
//		
//
//		shop.setEmployees(employee);

		shopOwner.setShopOwner_Id(10);
		shopOwner.setName("Akash");
		shopOwner.setDob(LocalDate.now());
		shopOwner.setAddress("A10, Mumbai");
		shopOwner.setShop_id(shop);
		shop.setShopOwner(shopOwner);

		serviceShopOwner.addShopOwner(shopOwner);
		serviceShop.addShop(shop);//<---------------

		shop = serviceShop.searchShopById(100);

		System.out.println();
	}

}
