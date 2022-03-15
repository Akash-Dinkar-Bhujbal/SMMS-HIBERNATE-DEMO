package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "shopOwner")
public class ShopOwner implements Serializable {

	private static final long serialVersionUID = 1L;

//	id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // AutoIncrement
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	name
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

//	shop_idS
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="shop_id")
	/* IMP CHECK ONES */
	private Shop shop_id;

	public Shop getShop_id() {
		return shop_id;
	}

	public void setShop_id(Shop shop_id) {
		this.shop_id = shop_id;
	}
}
