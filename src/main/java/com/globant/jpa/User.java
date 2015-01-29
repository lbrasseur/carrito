package com.globant.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

	@Id
	private int userId;
	private String userMail;
	private String userPassword;
	private String uerName;
	private int userCartId;
	
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUerName() {
		return uerName;
	}
	public void setUerName(String uerName) {
		this.uerName = uerName;
	}
	public int getUserCartId() {
		return userCartId;
	}
	public void setUserCartId(int userCartId) {
		this.userCartId = userCartId;
	}
	
}
