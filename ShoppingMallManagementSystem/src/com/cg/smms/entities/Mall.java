package com.cg.smms.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "mall")
public class Mall implements Serializable {

	private static final long serialVersionUID = 1L;
//	Id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // AutoIncrement
	private long Id;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

//	mallAdmin
	@OneToOne(cascade = CascadeType.ALL)
	private MallAdmin mallAdmin;

	public MallAdmin getMallAdmin() {
		return mallAdmin;
	}

	public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}

//	mallName
	private String mallName;

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

//	location
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

//	shop_id
	private Shop shop_id;

	public Shop getShop_id() {
		return shop_id;
	}

	public void setShop_id(Shop shop_id) {
		this.shop_id = shop_id;
	}

//	categories
	private String categories;

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}
}
