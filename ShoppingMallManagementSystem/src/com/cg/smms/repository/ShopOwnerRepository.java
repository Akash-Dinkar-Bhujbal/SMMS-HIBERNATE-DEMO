package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.ShopOwner;

public class ShopOwnerRepository implements IShopOwnerRepository {
	private EntityManager entityManager;

//	Constructor
	public ShopOwnerRepository() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		entityManager.persist(shopOwner);
		return shopOwner;
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
		// TODO Auto-generated method stub
		entityManager.merge(shopOwner);
		return shopOwner;
	}

	@Override
	public ShopOwner searchShopOwner(long id) {
		ShopOwner shopOwner = entityManager.find(ShopOwner.class, id);
		return shopOwner;
	}

	@Override
	public boolean deleteShopOwner(long id) {
		// TODO Auto-generated method stub
		entityManager.remove(searchShopOwner(id));
		return true;
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

}
