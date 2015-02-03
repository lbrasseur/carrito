package com.globant.jpa;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int userId;
	
	@Column
	private String userMail;
	
	@Column
	private String userPassword;
	
	@Column
	private String userName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "User")
	private Set<Cart> carrito;
	
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
	
}
