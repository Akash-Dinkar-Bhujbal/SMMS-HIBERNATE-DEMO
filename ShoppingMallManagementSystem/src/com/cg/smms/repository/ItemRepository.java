package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Item;

public class ItemRepository implements IItemRepository {
	private EntityManager entityManager;

//	Constructor
	public ItemRepository() {
		entityManager = JPAUtil.getEntityManager();
	}

//	addItem
	@Override
	public Item addItem(Item item) {
		entityManager.persist(item);
		return item;
	}

//	updateItem
	@Override
	public Item updateItem(Item item) {
		// TODO Auto-generated method stub
		entityManager.merge(item);
		return item;
	}

//	searchItem
	@Override
	public Item searchItem(long id) {
		Item item = entityManager.find(Item.class, id);
		return item;
	}

//	deleteItem
	@Override
	public Item deleteItem(long id) {
		Item item = entityManager.find(Item.class, id);
		entityManager.remove(searchItem(id));
		return item;
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
