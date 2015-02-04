package com.globant.carrito.product;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Items {

	@Id
	@GeneratedValue
	private int itemId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Cart carrito;
	
	@OneToOne(cascade = CascadeType.ALL)
	private int categoriesId;
	
	@Column
	private String itemDescription;
	
	@Column
	private int itemQuantity;
	
	@Column
	private double itemPrice;
	
	public Items() {
	}

	public Items(String itemDescription, Double itemPrice) {
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
	}
	
	public void setCart(Cart cart) {
		this.carrito = cart;
	}
	
	public int getItemId() {
		return itemId;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public int getCategoriesId() {
		return categoriesId;
	}
	public void setCategoriesId(int categoriesId) {
		this.categoriesId = categoriesId;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

}
