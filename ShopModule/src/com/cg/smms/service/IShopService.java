package com.cg.smms.service;

import com.cg.smms.entities.Shop;

public interface IShopService {
	Shop addShop(Shop shop);

	Shop updateShop(Shop shop);

	Shop searchShopById(int shopId);

	boolean deleteShop(int shopId);

//	ShopOwner addShopOwner(ShopOwner shopOwner);
//
//	ShopOwner updateShopOwner(ShopOwner shopOwner);
//
//	ShopOwner searchShopOwner(int shopOwnerId);
//
//	boolean deleteShopOwner(int shopOwnerId);
//
//	boolean addEmployee(Employee employee);
//
//	boolean updateEmployee(Employee employee);
//
//	boolean deleteEmployee(int id);
//
//	Item addItem(Item item);

}
