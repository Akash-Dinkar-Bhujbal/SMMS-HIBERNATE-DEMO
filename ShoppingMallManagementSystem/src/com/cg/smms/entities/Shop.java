package com.cg.smms.entities;

import java.io.*;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "shop")
public class Shop implements Serializable {

	private static final long serialVersionUID = 1L;
//	shopId
	@Id // PK
	@Column(name = "shopId")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
//	@OneToOne(mappedBy = "shop") // current table
//	@JoinColumn(name = "shopId")
	private int shopId;

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

//	shopCategory
	private String shopCategory;

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

//	shopEmployeeID
//	private Employee shopEmployeeID;
	@OneToMany(mappedBy = "shop_id")
//	(mappedBy = "shop")
//	@JoinColumn(name = "shopEmployeeID") // FK
	private List<Employee> employees = new ArrayList<Employee>();

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	// shopName
	private String shopName;

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

//	customers
	private String customers;

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

//	shopStatus
	private String shopStatus;

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

//	shopOwner
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shopOwnerId") // FK
	private ShopOwner shopOwnerId;

	public ShopOwner getShopOwnerId() {
		return shopOwnerId;
	}

	public void setShopOwnerId(ShopOwner shopOwnerId) {
		this.shopOwnerId = shopOwnerId;
	}

	// leaseStatus
	private String leaseStatus;

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

}
