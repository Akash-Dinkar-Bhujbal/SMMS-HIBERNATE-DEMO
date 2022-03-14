package com.cg.smms.service;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;

public interface IOrderService {
	OrderDetails addOrder(OrderDetails order);

	OrderDetails updateOrder(OrderDetails order);

	OrderDetails searchOrder(long id);

	Boolean cancelMall(long id);

	Item addItem(Item item);

}
