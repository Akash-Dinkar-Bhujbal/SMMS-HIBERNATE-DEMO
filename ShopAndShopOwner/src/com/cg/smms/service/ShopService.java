package com.cg.smms.service;

import com.cg.smms.entities.Shop;
import com.cg.smms.entities.ShopOwner;
import com.cg.smms.repository.IShopOwnerRepository;
import com.cg.smms.repository.IShopRepository;
import com.cg.smms.repository.ShopOwnerRepository;
import com.cg.smms.repository.ShopRepository;

public class ShopService implements IShopService {

	private IShopRepository ShopDAO;
	private IShopOwnerRepository soDAO;
//	private IEmployeeRepository EmployeeDAO;
//	IEmployeeService serviceEmp;

//	Constructor
	public ShopService() {
		ShopDAO = new ShopRepository();
		soDAO = new ShopOwnerRepository();
//		EmployeeDAO = new EmployeeRepository();
//		serviceEmp = new EmployeeService();
//		ItemDAO = new ItemRepository();
	}

	@Override
	public Shop addShop(Shop shop) {
		// TODO Auto-generated method stub
		ShopDAO.beginTransaction();
		shop = ShopDAO.addShop(shop);
		ShopDAO.commitTransaction();
		System.out.println("1Shop Created");
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		// TODO Auto-generated method stub
		ShopDAO.beginTransaction();
		ShopDAO.updateShop(shop);
		ShopDAO.commitTransaction();
		System.out.println("Shop updated");
		return shop;
	}

	@Override
	public Shop searchShopById(int shopId) {
		// TODO Auto-generated method stub
		Shop shop = ShopDAO.searchShopById(shopId);
		System.out.println("Check Shop Details");
		return shop;
	}

	@Override
	public boolean deleteShop(int shopId) {
		// TODO Auto-generated method stub
		ShopDAO.beginTransaction();
		ShopDAO.deleteShop(shopId);
		ShopDAO.commitTransaction();
		System.out.println("Shop deleted");
		return false;
	}
//
//	@Override
//	public ShopOwner addShopOwner(ShopOwner shopOwner) {
//		// TODO Auto-generated method stub
//		ShopOwnerDAO.beginTransaction();
//		shopOwner = ShopOwnerDAO.addShopOwner(shopOwner);
//		ShopOwnerDAO.commitTransaction();
//		return shopOwner;
//	}
//
//	@Override
//	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
//		// TODO Auto-generated method stub
//		ShopOwnerDAO.beginTransaction();
//		shopOwner = ShopOwnerDAO.updateShopOwner(shopOwner);
//		ShopOwnerDAO.commitTransaction();
//		return shopOwner;
//	}
//
//	@Override
//	public ShopOwner searchShopOwner(int shopOwnerId) {
//		// TODO Auto-generated method stub
//		ShopOwner shopOwner = ShopOwnerDAO.searchShopOwner(shopOwnerId);
//		return shopOwner;
//	}
//
//	@Override
//	public boolean deleteShopOwner(int shopOwnerId) {
//		// TODO Auto-generated method stub
//		ShopOwnerDAO.beginTransaction();
//		ShopOwnerDAO.deleteShopOwner(shopOwnerId);
//		ShopOwnerDAO.commitTransaction();
//		return true;
//	}
//
//	@Override
//	public boolean addEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		employee = serviceEmp.addEmployee(employee);
//		return true;
//	}
//
//	@Override
//	public boolean updateEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		employee = serviceEmp.updateEmployee(employee);
//		return true;
//	}
//
//	@Override
//	public boolean deleteEmployee(int id) {
//		// TODO Auto-generated method stub
//		serviceEmp.deleteEmployee(id);
//		return true;
//	}
//
//	@Override
//	public Item addItem(Item item) {
//		// TODO Auto-generated method stub
//		ItemDAO.beginTransaction();
//		item = ItemDAO.addItem(item);
//		ItemDAO.commitTransaction();
//		return item;
//	}

	@Override
	public ShopOwner addShopOwner(ShopOwner so) {
		// TODO Auto-generated method stub
		soDAO.beginTransaction();
		so = soDAO.addShopOwner(so);
		soDAO.commitTransaction();
		System.out.println("1ShopOwner Created");
		return so;
	}


}
