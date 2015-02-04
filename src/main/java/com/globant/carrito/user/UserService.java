package com.globant.carrito.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
	
	  protected EntityManagerFactory emf;

	  public UserService(EntityManagerFactory emf) {
		  this.emf = emf;
	  }
	
	@RequestMapping(value = "/service/createuser", method = RequestMethod.GET)
	@ResponseBody
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
	
	@RequestMapping(value = "/service/removeuser", method = RequestMethod.GET)
	@ResponseBody
	public void removeUser(String mail) {
		EntityManager em = emf.createEntityManager(); 
		User emu = findUser(mail);
		if (emu != null) {
			em.remove(emu);
	  }
		em.persist(emu);
		em.close();
	}

	@RequestMapping(value = "/service/user", method = RequestMethod.GET)
	@ResponseBody
	public User findUser(String mail) {
	  EntityManager em = emf.createEntityManager(); 
	  User u = em.find(User.class, mail);
	  em.close();
	  return u;
	}
	
	public String getUserMail(String mail) {		
		EntityManager em = emf.createEntityManager();
		TypedQuery<User> query = em.createQuery("from User where userMail = :mail", User.class);
		query.setParameter("mail", mail);
		query.getSingleResult();
		em.close();
		return getUserMail(mail);
	}
	public String getPassword(String pass) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<User> query = em.createQuery("from User where userPassword = :pass", User.class);
		query.setParameter("pass", pass);
		query.getSingleResult();
		em.close();
		return getPassword(pass);
	}
}
