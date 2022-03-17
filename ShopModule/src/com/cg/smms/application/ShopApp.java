package com.cg.smms.application;

import java.time.LocalDate;

import com.cg.smms.entities.*;
import com.cg.smms.repository.*;
import com.cg.smms.service.*;

public class ShopApp {

	public static void main(String[] args) {
		Shop shop = new Shop();

		IShopService serviceShop = new ShopService();

		/* Create Operation */
//		shop.setShopId(100);
//		shop.setShopCategory("Food");
//		shop.setShopName("KFC");
//		shop.setShopStatus("Open");
//		shop.setLeaseStatus("Paid");

//		serviceShop.addShop(shop);// <---------------

		/* search */

//		shop = serviceShop.searchShopById(100);
//		System.out.println("ShopId : " + shop.getShopId());
//		System.out.println("ShopName : " + shop.getShopName());
		
		/* update */
//		shop = serviceShop.searchShopById(100);
//		shop.setShopName("PizzaHut");
//		serviceShop.updateShop(shop);
		
		/* remove */
//		serviceShop.deleteShop(100);
		

	}

}