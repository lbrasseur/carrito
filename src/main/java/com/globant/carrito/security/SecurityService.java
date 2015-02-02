package com.globant.carrito.security;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import com.globant.carrito.StatusDto;

@RestController
public class SecurityService {

	@RequestMapping(value = "/service/login", method=RequestMethod.POST)
	@ResponseBody
	public String getData(Postdata postdata, @Context HttpServletRequest request) {
	  HttpSession session = request.getSession();
	}
	
    @RequestMapping(value="/",produces = "application/json")
    public Map<String,String> helloUser(Principal principal) {
        HashMap<String,String> result = new HashMap<String,String>();
        result.put("username", principal.getName());
        return result;
    }

    @RequestMapping("/logout")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void logout(HttpSession session) {
        session.invalidate();
    }
}


