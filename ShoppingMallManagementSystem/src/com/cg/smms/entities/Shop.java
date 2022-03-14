package com.cg.smms.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shop")
public class Shop implements Serializable {

	private static final long serialVersionUID = 1L;
//	shopId
	@Id
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
	private Employee shopEmployeeID;

	public Employee getShopEmployeeID() {
		return shopEmployeeID;
	}

	public void setShopEmployeeID(Employee shopEmployeeID) {
		this.shopEmployeeID = shopEmployeeID;
	}

//	shopName
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
	private ShopOwner shopOwner;

	public ShopOwner getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}

//	leaseStatus
	private String leaseStatus;

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	
//	Employee
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "empId")
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
//	Items
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "itemId")
	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}
