package com.cg.smms.service;

import com.cg.smms.entities.User;

public interface IUserService {
	User addNewUser(User user);

	User updateUser(User user);

	User login(User user);

	Boolean logOut();
}
