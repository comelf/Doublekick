package com.doublekick.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.doublekick.entity.Account;
import com.doublekick.model.UserDetail;
import com.doublekick.repository.AccountRepository;

@Service
public class LoginUserDetailsService implements UserDetailsService {
	@Autowired
	AccountRepository accountRepo;
 
	@Override
	public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
		Account account = accountRepo.findByLoginId(loginId);

		if (account == null) {
			// 계정이 존재하지 않음
			throw new UsernameNotFoundException("login fail");
		}

		return new UserDetail(account);
	}
}
