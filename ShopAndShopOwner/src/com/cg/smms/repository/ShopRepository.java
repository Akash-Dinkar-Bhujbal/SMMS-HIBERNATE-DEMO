package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Shop;

public class ShopRepository implements IShopRepository {
	private EntityManager entityManager;

//	Constructor
	public ShopRepository() {
		entityManager = JPAUtil.getEntityManager();
	}

//	addShop
	@Override
	public Shop addShop(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}

//	updateShop
	@Override
	public Shop updateShop(Shop shop) {
		entityManager.merge(shop);
		return shop;
	}

//	searchShopById
	@Override
	public Shop searchShopById(int id) {
		Shop shop = entityManager.find(Shop.class, id);
		return shop;
	}

//	deleteShop
	@Override
	public boolean deleteShop(int shopId) {
		entityManager.remove(searchShopById(shopId));
		return true;
	}

//	beginTransaction
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

//	commitTransaction
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
