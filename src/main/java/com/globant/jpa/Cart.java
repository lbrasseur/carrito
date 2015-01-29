package com.globant.jpa;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {

	@Id
	private int cartId;
	private int userId;
	private int itemId;
	private double finalPrice;
	private int finalQuantity;
	private boolean isEmpty;
	private boolean checkOut;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
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
