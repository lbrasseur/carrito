package com.globant.jpa;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue
	private int cartId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private int userId;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "Cart")
	private Set<Items> items;
	
	@Column
	private double finalPrice;
	
	@Column
	private int finalQuantity;
	
	@Column
	private boolean isEmpty;
	
	@Column
	private boolean checkOut;
	
	public Cart() {
	}

	public Cart(Items... initialItems) {
		items = new HashSet<Items>();
		for (Items item : initialItems) {
			addItem(item);
		}
	}

	public void addItem(Items item) {
		items.add(item);
		/* Esto es necesario para que cargue la "clave foranea" */
		item.setCart(this);
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public int getFinalQuantity() {
		return finalQuantity;
	}
	public void setFinalQuantity(int finalQuantity) {
		this.finalQuantity = finalQuantity;
	}
	public boolean isEmpty() {
		return isEmpty;
	}
	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	public boolean isCheckOut() {
		return checkOut;
	}
	public void setCheckOut(boolean checkOut) {
		this.checkOut = checkOut;
	}
}
