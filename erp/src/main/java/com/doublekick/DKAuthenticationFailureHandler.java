package com.doublekick;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class DKAuthenticationFailureHandler implements AuthenticationFailureHandler{

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e)
			throws IOException, ServletException {
		
		if(e instanceof UsernameNotFoundException){
			request.setAttribute("loginError", "notFound");
		} 
			
		if(e instanceof BadCredentialsException){
			request.setAttribute("loginError", "badCredentials");
			request.setAttribute("account", request.getParameter("account"));
		}
		
		request.getRequestDispatcher("/account/login").forward(request, response);
	}

}
