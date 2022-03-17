package com.cg.smms.service;

import java.util.List;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.Mall;
import com.cg.smms.entities.User;
import com.cg.smms.repository.CustomerRepository;
import com.cg.smms.repository.ICustomerRepository;
import com.cg.smms.repository.IItemRepository;
import com.cg.smms.repository.IMallRepository;
import com.cg.smms.repository.IOrderRepository;
import com.cg.smms.repository.IUserRepository;
import com.cg.smms.repository.ItemRepository;
import com.cg.smms.repository.MallRepository;
import com.cg.smms.repository.OrderRepository;
import com.cg.smms.repository.UserRepository;

public class CustomerService implements ICustomerService {
	private ICustomerRepository CustomerDAO;
	private IItemRepository ItemDAO;
	private IMallRepository MallDAO;//Not Required
	private IOrderRepository OrderDAO;
	private IUserRepository UserDAO;
	

//	Constructor
	public CustomerService() {
		CustomerDAO = new CustomerRepository();
		ItemDAO = new ItemRepository();
		MallDAO = new MallRepository();// Not Required
		OrderDAO = new OrderRepository();
		UserDAO = new UserRepository();
	}

	@Override
	public List<Item> searchItem(String itemName) {
		// TODO Auto-generated method stub
//		Need to work in item entity class:List items
//		find
//		List<Item> items = new ArrayList<Item>();
//		items.add(itemName);
		return null;
	}

	@Override
	public Item orderItem(Item item) {
		// TODO Auto-generated method stub
		ItemDAO.beginTransaction();
//		work pending: find/search
//		List?
		ItemDAO.commitTransaction();
		return item;
	}

	@Override
	public Mall searchMall(int id) {
		// TODO Auto-generated method stub
//		work pending:
		return null;
	}

	@Override
	public Boolean cancelOrder(int orderId) {
		// TODO Auto-generated method stub
//		work pending:
		return false;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
//		work pending : same as UserService
		return user;
	}

	@Override
	public Boolean logOut() {
		// TODO Auto-generated method stub
//		Work pending: same as UserService
		return false;
	}

}
