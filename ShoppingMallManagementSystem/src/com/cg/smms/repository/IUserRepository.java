package com.cg.smms.repository;

import com.cg.smms.entities.User;

public interface IUserRepository {

	User addNewUser(User user);

	User updateUser(User user);

	User deleteUser(long id);

	void beginTransaction();

	void commitTransaction();
}
