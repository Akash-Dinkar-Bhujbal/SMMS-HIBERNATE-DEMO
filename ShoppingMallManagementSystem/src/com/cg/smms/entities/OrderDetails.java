package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class OrderDetails implements Serializable {

	private static final long serialVersionUID = 1L;
//	id
	@Id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	dateOfPurchase
	private LocalDateTime dateOfPurchase;

	public LocalDateTime getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

//	total
	private float total;

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

//	customer_id
	private Customer customer_id;

	public Customer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Customer customer_id) {
		this.customer_id = customer_id;
	}

//	paymentMode
	private String paymentMode;

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

//	shop_id
	private Shop shop_id;

	public Shop getShop_id() {
		return shop_id;
	}

	public void setShop_id(Shop shop_id) {
		this.shop_id = shop_id;
	}
}
