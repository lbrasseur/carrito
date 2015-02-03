package com.globant.carrito.security;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.globant.carrito.user.User;

import sample.Carrito;

public class LoginDto {
	private String userMail;
	private String userPassword;
	protected EntityManagerFactory emf;

	  public LoginDto(EntityManagerFactory emf) {
		  this.emf = emf;
	  }
	
	public String getUserMail(String mail) {		
		EntityManager em = emf.createEntityManager();
		userMail = em.createQuery("from User where userMail = "+mail, User.class).getSingleResult();
		em.close();
		return userMail;
	}
	public String getPassword(String pass) {
		EntityManager em = emf.createEntityManager();
		userMail = em.createQuery("from User where userPassword = "+pass, User.class).getSingleResult();
		em.close();
		return userPassword;
	}
}
