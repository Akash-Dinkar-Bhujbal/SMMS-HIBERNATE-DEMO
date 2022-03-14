package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Item;
import com.cg.smms.entities.Shop;
import com.cg.smms.repository.EmployeeRepository;
import com.cg.smms.repository.IEmployeeRepository;
import com.cg.smms.repository.IItemRepository;
import com.cg.smms.repository.IShopRepository;
import com.cg.smms.repository.ItemRepository;
import com.cg.smms.repository.ShopRepository;

public class ShopService implements IShopService {

	private IShopRepository ShopDAO;
	private IEmployeeRepository EmployeeDAO;
	private IItemRepository ItemDAO;

//	Constructor
	public ShopService() {
		ShopDAO = new ShopRepository();
		EmployeeDAO = new EmployeeRepository();
		ItemDAO = new ItemRepository();
	}

//	addShop
	@Override
	public Shop addShop(Shop shop) {
		ShopDAO.beginTransaction();
		ShopDAO.addShop(shop);
		ShopDAO.commitTransaction();
		return shop;
	}

//	updateShop
	@Override
	public Shop updateShop(Shop shop) {
		ShopDAO.beginTransaction();
		ShopDAO.updateShop(shop);
		ShopDAO.commitTransaction();
		return shop;
	}

//	searchShopById
	@Override
	public Shop searchShopById(long id) {
		Shop shop = ShopDAO.searchShopById(id);
		return shop;
	}

//	addEmployee
	@Override
	public Boolean addEmployee(Employee employee) {
		EmployeeDAO.beginTransaction();
		EmployeeDAO.addEmployee(employee);
		EmployeeDAO.commitTransaction();
		return true;
	}

//	updateEmployee
	@Override
	public Employee updateEmployee(Employee employee) {
		EmployeeDAO.beginTransaction();
		EmployeeDAO.updateEmployee(employee);
		EmployeeDAO.commitTransaction();
		return employee;
	}

//	deleteShop
	@Override
	public Boolean deleteShop(long id) {
		ShopDAO.beginTransaction();
		ShopDAO.deleteShop(id);
		ShopDAO.commitTransaction();
		return true;
	}

	@Override
	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		ItemDAO.beginTransaction();
		ItemDAO.addItem(item);
		ItemDAO.commitTransaction();
		return item;
	}

}
