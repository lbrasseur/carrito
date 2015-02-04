package com.globant.carrito;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globant.carrito.user.UserService;

@SpringBootApplication
public class CarritoApplication {

	protected EntityManager em;

    public static void main(String[] args) {
        
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("UserService");
    	UserService userservice = new UserService(emf);
    	
    	SpringApplication.run(CarritoApplication.class, args);
        
        
    }
}
