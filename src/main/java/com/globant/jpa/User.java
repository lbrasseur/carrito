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
	private String userName;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String uerName) {
		this.userName = uerName;
	}
	public int getUserCartId() {
		return userCartId;
	}
	public void setUserCartId(int userCartId) {
		this.userCartId = userCartId;
	}
	
}
