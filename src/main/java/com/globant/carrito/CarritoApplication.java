package com.globant.carrito;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarritoApplication {

	protected EntityManager em;

    public static void main(String[] args) {
        SpringApplication.run(CarritoApplication.class, args);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UserService");
        UserService(emf);
    }
}
