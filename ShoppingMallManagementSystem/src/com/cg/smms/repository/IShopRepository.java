package com.cg.smms.repository;

import com.cg.smms.entities.Shop;

public interface IShopRepository {
	Shop addShop(Shop shop);

	Shop updateShop(Shop shop);

	Shop searchShopById(long id);

	boolean deleteShop(long id);

	void beginTransaction();

	void commitTransaction();

}
