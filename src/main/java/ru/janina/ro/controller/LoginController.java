package ru.janina.ro.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
//	@RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
//	public String logoutDo(HttpServletRequest request,HttpServletResponse response){
//	HttpSession session= request.getSession(false);
//	    SecurityContextHolder.clearContext();
//	         session= request.getSession(false);
//	        if(session != null) {
//	            session.invalidate();
//	        }
//	        for(Cookie cookie : request.getCookies()) {
//	            cookie.setMaxAge(0);
//	        }
//
//	    return "logout";
//	}
}
