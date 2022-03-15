package com.cg.smms.service;

import com.cg.smms.entities.Shop;
import com.cg.smms.entities.User;
import com.cg.smms.repository.IUserRepository;
import com.cg.smms.repository.UserRepository;

public class AdminService implements IAdminService {
	private IUserRepository UserDAO;

//	Constructor
	public AdminService() {
		UserDAO = new UserRepository();
	}

	@Override
	public Boolean approaveNewShop(Shop shop) {
		// TODO Auto-generated method stub
//		Work pending : addNewUser
		return true;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		UserDAO.beginTransaction();
		UserDAO.updateUser(user);
		UserDAO.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
//		Work pending : same as UserService
		return user;
	}

	@Override
	public Boolean logOut() {
		// TODO Auto-generated method stub
//		Work pending : same as UserService
		return false;
	}

}
