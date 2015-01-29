package com.globant.carrito.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
	@RequestMapping(value = "/service/user", method = RequestMethod.GET)
	@ResponseBody
	public UserResponse getUser() {
		UserResponse response = new UserResponse();
		response.getResults().add(new User("mail@prueba.com", "1234", "Martin"));
		response.getResults().add(new User("otromail@prueba.com", "qwerty", "Lautaro"));
		response.getResults().add(new User("masmails@prueba.com", "password", "Marcos"));
		return response;
	}
}