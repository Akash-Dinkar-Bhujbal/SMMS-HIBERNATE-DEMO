package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Item;
import com.cg.smms.entities.Shop;

public interface IShopService {
	Shop addShop(Shop shop);

	Shop updateShop(Shop shop);

	Shop searchShopById(long id);

	Boolean addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	Boolean deleteShop(long id);

	Item addItem(Item item);
}
