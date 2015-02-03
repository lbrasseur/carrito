package com.globant.carrito.security;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.globant.carrito.StatusDto;

@RestController
public class SecurityService {

	@RequestMapping(value = "/service/login", method=RequestMethod.POST)
	@ResponseBody
	public String getData(HttpServletRequest request) {
	  HttpSession session = request.getSession();
	  return null;
	}
	
    @RequestMapping("/service/logout")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void logout(HttpSession session) {
        session.invalidate();
    }
}


