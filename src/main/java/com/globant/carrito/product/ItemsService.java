package com.globant.carrito.product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.globant.carrito.product.Cart;
import com.globant.carrito.product.Items;

@RestController
public class ItemsService {
	
	@RequestMapping(value = "/service/products", method = RequestMethod.GET)
	@ResponseBody
	public ItemResponse getProducts() {
		ItemResponse response = new ItemResponse();
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("items");

		EntityManager em = emFactory.createEntityManager();

		for (Items items : em.createQuery("from items", Items.class)
				.getResultList()) {

			for (Items item : Items.getItemId()) {
				System.out.println("- " + item.getItemDescription() + " $"
						+ item.getItemPrice());			
				}
		}
		
		em.close();
		return response;
	}
	
	@RequestMapping(value = "/service/products", method = RequestMethod.GET)
	@ResponseBody
	public ItemResponse addProducts() {
		ItemResponse response = new ItemResponse();
		
		return response;
	}
}
