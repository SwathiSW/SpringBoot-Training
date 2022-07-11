package com.springboot_security_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Config extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests().anyRequest()
		.authenticated().and()
		.httpBasic().and()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		String password = passwordEncoder().encode("SuDeB");
		String adminPassword = passwordEncoder().encode("AdMiN");
		
		System.out.println(password+ " /n "+ adminPassword);
		
		auth.inMemoryAuthentication()
		.withUser("sudeb").password(password)
		.roles("USER").and().withUser("admin")
		.password(adminPassword)
		.credentialsExpired(false)
		.accountExpired(false).accountLocked(false)
		.authorities("WRITE_PRIVILEGES", "READ_PRIVILEGES")
		.roles("ADMIN");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder);
		return encoder;
	}
}
