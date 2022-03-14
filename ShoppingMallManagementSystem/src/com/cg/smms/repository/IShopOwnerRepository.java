package com.cg.smms.repository;

import com.cg.smms.entities.ShopOwner;

public interface IShopOwnerRepository {

	ShopOwner addShopOwner(ShopOwner shopOwner);

	ShopOwner updateShopOwner(ShopOwner shopOwner);

	ShopOwner searchShopOwner(long id);

	boolean deleteShopOwner(long id);

	void commitTransaction();

	void beginTransaction();
}
