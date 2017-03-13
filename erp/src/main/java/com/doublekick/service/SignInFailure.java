package com.doublekick.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Service;

@Service
public class SignInFailure implements ApplicationListener<AuthenticationFailureBadCredentialsEvent>{
	Logger logger = LoggerFactory.getLogger(SignInFailure.class);
	
	@Override
	public void onApplicationEvent(AuthenticationFailureBadCredentialsEvent event)
	{
		String account = (String)event.getAuthentication().getPrincipal();
		String password = (String)event.getAuthentication().getCredentials();
		
		logger.info("임시 : 접속실패 : " + account + " / " + password);
	}

}
