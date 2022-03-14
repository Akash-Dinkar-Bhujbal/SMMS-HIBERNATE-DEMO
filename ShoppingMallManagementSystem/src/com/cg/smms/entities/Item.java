package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "item")
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
//	id
	@Id
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

//	manufacturing
	private LocalDate manufacturing;

	public LocalDate getManufacturing() {
		return manufacturing;
	}

	public void setManufacturing(LocalDate manufacturing) {
		this.manufacturing = manufacturing;
	}

//	LocalDate
	private LocalDate LocalDate;

	public LocalDate getLocalDate() {
		return LocalDate;
	}

	public void setLocalDate(LocalDate localDate) {
		LocalDate = localDate;
	}

//	price
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

//	category
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
