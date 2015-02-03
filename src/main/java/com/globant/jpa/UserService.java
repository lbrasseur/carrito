package com.globant.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class UserService {
	
	  protected EntityManagerFactory emf;

	  public UserService(EntityManagerFactory emf) {
		  this.emf = emf;
	  }
	
	public User createUser(String mail, String pass, String name){
		EntityManager em = emf.createEntityManager(); 
		User emu = new User();
		emu.setUserMail(mail);
		emu.setUserPassword(pass);
		emu.setUserName(name);
		em.persist(emu);
		em.close();
		return emu;
	}
	
	public void removeUser(String mail) {
		EntityManager em = emf.createEntityManager(); 
		User emu = findUser(mail);
		if (emu != null) {
			em.remove(emu);
	  }
		em.persist(emu);
		em.close();
	}

	public User findUser(String mail) {
	  EntityManager em = emf.createEntityManager(); 
	  User u = em.find(User.class, mail);
	  em.close();
	  return u;
	}
}
