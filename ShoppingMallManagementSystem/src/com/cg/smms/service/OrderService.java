package com.cg.smms.service;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;
import com.cg.smms.repository.IItemRepository;
import com.cg.smms.repository.IMallRepository;
import com.cg.smms.repository.IOrderRepository;
import com.cg.smms.repository.ItemRepository;
import com.cg.smms.repository.MallRepository;
import com.cg.smms.repository.OrderRepository;

public class OrderService implements IOrderService {
	private IOrderRepository OrderDAO;
	private IMallRepository MallDAO;
	private IItemRepository ItemDAO;

//	Constructor
	public OrderService() {
		// TODO Auto-generated constructor stub
		OrderDAO = new OrderRepository();
		MallDAO = new MallRepository();
		ItemDAO = new ItemRepository();
	}

//	addOrder
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		OrderDAO.beginTransaction();
		OrderDAO.addOrder(order);
		OrderDAO.commitTransaction();
		return order;
	}

//	updateOrder
	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		OrderDAO.beginTransaction();
		OrderDAO.updateOrder(order);
		OrderDAO.commitTransaction();
		return order;
	}

//	OrderDetails
	@Override
	public OrderDetails searchOrder(long id) {
		// TODO Auto-generated method stub
		OrderDetails order = searchOrder(id);
		return order;
	}

//	cancelMall
	@Override
	public Boolean cancelMall(long id) {
		// TODO Auto-generated method stub
//		Work pending:
		MallDAO.beginTransaction();
//		MallDAO.cancelMall(id);
		MallDAO.commitTransaction();
		return true;
	}

//	addItem
	@Override
	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		ItemDAO.beginTransaction();
		ItemDAO.addItem(item);
		ItemDAO.commitTransaction();
		return item;
	}

}
