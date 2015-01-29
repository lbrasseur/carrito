package com.globant.carrito.user;

public class User {

	private String userMail;
	private String userPassword;
	private String userName;
	
	public User(String mail, String pass, String name){
		this.setUserMail(mail);
		this.setUserPassword(pass);
		this.setUserName(name);
	}

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

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
