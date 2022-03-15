package com.cg.smms.service;

import com.cg.smms.entities.User;
import com.cg.smms.repository.IUserRepository;
import com.cg.smms.repository.UserRepository;

public class UserService implements IUserService {
	private IUserRepository UserDAO;

//	Constructor
	public UserService() {
		UserDAO = new UserRepository();
	}

//	addNewUser
	@Override
	public User addNewUser(User user) {
		UserDAO.beginTransaction();
		UserDAO.addNewUser(user);
		UserDAO.commitTransaction();
		return user;
	}

//	updateUser
	@Override
	public User updateUser(User user) {
		UserDAO.beginTransaction();
		UserDAO.updateUser(user);
		UserDAO.commitTransaction();
		return user;
	}

//	login
	@Override
	public User login(User user) {
//		Main method calling this function
//		We will give next user option
		return user;
	}

//	logOut
	@Override
	public Boolean logOut() {
//		Goto back window
//		Loop ends and Ask Options of Module
		return false;
	}

}
