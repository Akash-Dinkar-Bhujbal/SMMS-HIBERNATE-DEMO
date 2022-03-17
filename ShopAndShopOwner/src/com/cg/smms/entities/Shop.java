package com.cg.smms.entities;

import java.io.*;

import javax.persistence.*;

@Entity
@Table(name = "shop")
public class Shop implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shopId;
	
	private String shopCategory;
	private String shopName;
//	private String customers;
	private String shopStatus;
	private String leaseStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shopOwnerId") // fk
	private ShopOwner shopOwner;

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public ShopOwner getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

}