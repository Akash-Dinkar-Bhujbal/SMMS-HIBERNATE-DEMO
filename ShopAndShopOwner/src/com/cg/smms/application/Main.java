package com.cg.smms.application;

import java.time.LocalDate;

import com.cg.smms.entities.Shop;
import com.cg.smms.entities.ShopOwner;
import com.cg.smms.service.IShopService;
import com.cg.smms.service.ShopService;

public class Main {

	public static void main(String[] args) {
		Shop shop = new Shop();
		ShopOwner so = new ShopOwner();
		
		IShopService serviceShop = new ShopService();

//		so.setShopOwnerId(2);
		so.setName("Prathmesh");
		so.setDob(LocalDate.of(2000, 1, 1));
		so.setAddress("Mumbai");

		/* Create Operation */
//		shop.setShopId(100);
		shop.setShopCategory("Food");
		shop.setShopName("KFC");
		shop.setShopStatus("Open");
		shop.setShopOwner(so);
		shop.setLeaseStatus("Paid");


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
//		serviceShop.addShopOwner(so);
		serviceShop.addShop(shop);// <---------------
	}

}
