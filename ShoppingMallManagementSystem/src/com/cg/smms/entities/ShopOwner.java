package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "shopOwner")
public class ShopOwner implements Serializable {

	private static final long serialVersionUID = 1L;

//	id
	@Id // PK
	@Column(name = "shopOwnerId")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncrement
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "shopOwner")
	private int shopOwnerId;

	public int getShopOwnerId() {
		return shopOwnerId;
	}

	public void setShopOwnerId(int shopOwnerId) {
		this.shopOwnerId = shopOwnerId;
	}

	// name
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	dob
	private LocalDate dob;

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

//	address
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	shop_id
	@OneToOne(mappedBy = "shopowner") // current tablename //class name
//	@OneToOne(cascade = CascadeType.ALL) 
//	@JoinColumn(name = "shopId") // FK
	/* IMP CHECK ONES */
	private Shop shopId;

	public Shop getShopId() {
		return shopId;
	}

	public void setShopId(Shop shopId) {
		this.shopId = shopId;
	}

}
