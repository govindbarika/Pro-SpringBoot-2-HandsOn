package com.govind.directory.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.govind.directory.repository.PersonRepository;
import com.govind.directory.security.DirectoryUserDetailsService;

@Configuration
public class DirectorySecurityConfig extends WebSecurityConfigurerAdapter {
	private PersonRepository personRepository;

	public DirectorySecurityConfig(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/**").hasRole("ADMIN").and().httpBasic();
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(new DirectoryUserDetailsService(this.personRepository));
	}
}
