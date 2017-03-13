package com.doublekick;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.doublekick.entity.Account;
import com.doublekick.model.UserDetail;
import com.doublekick.repository.AccountRepository;
import com.doublekick.util.PhPass;

public class DKAuthenticationProvider implements AuthenticationProvider {

	private Logger logger = LoggerFactory.getLogger(DKAuthenticationProvider.class);
	
	@Autowired
	AccountRepository accountRepo;
	
	@Autowired
	PhPass phPass;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String loginId = (String) authentication.getPrincipal();
		String password = (String) authentication.getCredentials();
		
		 Account account = accountRepo.findByLoginId(loginId);
		
		if (account == null) {
			throw new UsernameNotFoundException("Account Not Found");
		}
		if(phPass.checkPassword( password, account.getPassword())){
			List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
			if(account.isAdmin()){
				roles.add(new SimpleGrantedAuthority("admin".toUpperCase()));
			}
			roles.add(new SimpleGrantedAuthority("user".toUpperCase()));
			UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(loginId, password, roles);
			result.setDetails(new UserDetail(account));
			return result;
		} else {
			logger.warn("로그인 정보 불일치 id = {}, password = {}", loginId, password);
			throw new BadCredentialsException("Bad credentials");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
