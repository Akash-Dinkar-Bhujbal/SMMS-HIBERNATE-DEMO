package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Mall;

public class MallRepository implements IMallRepository {
	private EntityManager entityManager;

//	Constructor
	public MallRepository() {
		entityManager = JPAUtil.getEntityManager();
	}

//	addMall
	@Override
	public Mall addMall(Mall mall) {
		// TODO Auto-generated method stub
		entityManager.persist(mall);
		return mall;
	}

//	updateMall
	@Override
	public Mall updateMall(Mall mall) {
		// TODO Auto-generated method stub
		entityManager.merge(mall);
		return mall;
	}

//	searchMall
	@Override
	public Mall searchMall(long id) {
		// TODO Auto-generated method stub
		Mall mall = entityManager.find(Mall.class, id);
		return mall;
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
