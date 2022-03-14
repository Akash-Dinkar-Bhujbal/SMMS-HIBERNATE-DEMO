package com.cg.smms.service;

import java.util.List;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.Mall;
import com.cg.smms.entities.User;

public interface ICustomerService {
	List<Item> searchItem(String itemName);

	Item orderItem(Item item);

	Mall searchMall(long id);

	Boolean cancelOrder(long orderId);

	User login(User user);

	Boolean logOut();
}
