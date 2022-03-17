package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.OrderDetails;

public class OrderRepository implements IOrderRepository {
	private EntityManager entityManager;

//	Constructor
	public OrderRepository() {
		entityManager = JPAUtil.getEntityManager();
	}

//	addOrder
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		entityManager.persist(order);
		return order;
	}

//	updateOrder
	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		entityManager.merge(order);
		return order;
	}

//	searchOrder
	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails order = entityManager.find(OrderDetails.class, id);
		return order;
	}

//	deleteOrder
	@Override
	public OrderDetails deleteOrder(int id) {
		OrderDetails order = entityManager.find(OrderDetails.class, id);
		entityManager.remove(order);
		return order;
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
