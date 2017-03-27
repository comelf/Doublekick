package com.doublekick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class DKSecurityConfigurer extends WebSecurityConfigurerAdapter {
	
	@Bean
	public DKAuthenticationProvider authenticationProvider(){
		return new DKAuthenticationProvider();
	}
	
	@Bean 
	public AuthenticationFailureHandler authenticationFailureHandler(){
		return new DKAuthenticationFailureHandler();
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/css/**", "/js/**", "/assets/**","/images/**");
	}
	
    @Autowired
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
    
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
			.antMatchers("/account/login","/account/loginp", "/account/create").permitAll()
			.antMatchers("/academy/**").authenticated()
			.antMatchers("/academy/media/photoUpload").authenticated().and().csrf().disable().httpBasic();
		
		http.formLogin()
			.loginProcessingUrl("/account/loginp")
			.loginPage("/account/login")
			.defaultSuccessUrl("/academy/")
			.usernameParameter("account")
			.passwordParameter("password")
			.failureHandler(authenticationFailureHandler());

		http.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/account/logout"))
				.logoutSuccessUrl("/");
	}

}
