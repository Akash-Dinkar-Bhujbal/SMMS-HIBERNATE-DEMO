package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.User;

public class UserRepository implements IUserRepository {
	private EntityManager entityManager;

//	Constructor
	public UserRepository() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(long id) {
		// TODO Auto-generated method stub
		return null;
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
