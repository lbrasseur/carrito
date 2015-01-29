package com.globant.jpa;

import javax.persistence.EntityManager;

public class UserService {
	
	protected EntityManager em;

	public UserService(EntityManager em) {
		this.em = em;
	}
	
	public User createUser(String mail, String pass, String name){
		User emu = new User();
		emu.setUserMail(mail);
		emu.setUserPassword(pass);
		emu.setUserName(name);
		return emu;
	}
	
	public void removeUser(String mail) {
	  User emu = findUser(mail);
	  if (emu != null) {
	    em.remove(emu);
	  }
	}

	public User findUser(String mail) {
	  return em.find(User.class, mail);
	}
}
