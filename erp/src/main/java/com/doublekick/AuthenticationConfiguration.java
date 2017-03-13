package com.doublekick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.doublekick.util.PhPass;

@Configuration
public class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	PhPass PhPass;
	
	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.userDetailsService(userDetailsService).passwordEncoder(PhPass);
	}
}
