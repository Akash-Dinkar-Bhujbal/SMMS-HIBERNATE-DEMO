package com.cg.smms.service;

import com.cg.smms.entities.Shop;
import com.cg.smms.entities.User;

public interface IAdminService {
	Boolean approaveNewShop(Shop shop);

	User updateUser(User user);

	User login(User user);

	Boolean logOut();
}
