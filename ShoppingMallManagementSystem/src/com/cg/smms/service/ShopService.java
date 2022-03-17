package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Item;
import com.cg.smms.entities.Shop;
import com.cg.smms.entities.ShopOwner;
import com.cg.smms.repository.EmployeeRepository;
import com.cg.smms.repository.IEmployeeRepository;
import com.cg.smms.repository.IItemRepository;
import com.cg.smms.repository.IShopOwnerRepository;
import com.cg.smms.repository.IShopRepository;
import com.cg.smms.repository.ItemRepository;
import com.cg.smms.repository.ShopOwnerRepository;
import com.cg.smms.repository.ShopRepository;

public class ShopService implements IShopService {

	private IShopRepository ShopDAO;
	private IShopOwnerRepository ShopOwnerDAO;
//	private IEmployeeRepository EmployeeDAO;
	IEmployeeService serviceEmp;
	private IItemRepository ItemDAO;

//	Constructor
	public ShopService() {
		ShopDAO = new ShopRepository();
		ShopOwnerDAO = new ShopOwnerRepository();
//		EmployeeDAO = new EmployeeRepository();
		serviceEmp = new EmployeeService();
		ItemDAO = new ItemRepository();
	}

	@Override
	public Shop addShop(Shop shop) {
		// TODO Auto-generated method stub
		ShopDAO.beginTransaction();
		ShopDAO.addShop(shop);
		ShopDAO.commitTransaction();
		return null;
	}

	@Override
	public Shop updateShop(Shop shop) {
		// TODO Auto-generated method stub
		ShopDAO.beginTransaction();
		ShopDAO.updateShop(shop);
		ShopDAO.commitTransaction();
		return shop;
	}

	@Override
	public Shop searchShopById(int shopId) {
		// TODO Auto-generated method stub
		Shop shop = ShopDAO.searchShopById(shopId);
		return shop;
	}

	@Override
	public boolean deleteShop(int shopId) {
		// TODO Auto-generated method stub
		ShopDAO.beginTransaction();
		ShopDAO.deleteShop(shopId);
		ShopDAO.commitTransaction();
		return false;
	}

	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		// TODO Auto-generated method stub
		ShopOwnerDAO.beginTransaction();
		shopOwner = ShopOwnerDAO.addShopOwner(shopOwner);
		ShopOwnerDAO.commitTransaction();
		return shopOwner;
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
		// TODO Auto-generated method stub
		ShopOwnerDAO.beginTransaction();
		shopOwner = ShopOwnerDAO.updateShopOwner(shopOwner);
		ShopOwnerDAO.commitTransaction();
		return shopOwner;
	}

	@Override
	public ShopOwner searchShopOwner(int shopOwnerId) {
		// TODO Auto-generated method stub
		ShopOwner shopOwner = ShopOwnerDAO.searchShopOwner(shopOwnerId);
		return shopOwner;
	}

	@Override
	public boolean deleteShopOwner(int shopOwnerId) {
		// TODO Auto-generated method stub
		ShopOwnerDAO.beginTransaction();
		ShopOwnerDAO.deleteShopOwner(shopOwnerId);
		ShopOwnerDAO.commitTransaction();
		return true;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employee = serviceEmp.addEmployee(employee);
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employee = serviceEmp.updateEmployee(employee);
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		serviceEmp.deleteEmployee(id);
		return true;
	}

	@Override
	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		ItemDAO.beginTransaction();
		item = ItemDAO.addItem(item);
		ItemDAO.commitTransaction();
		return item;
	}

}
