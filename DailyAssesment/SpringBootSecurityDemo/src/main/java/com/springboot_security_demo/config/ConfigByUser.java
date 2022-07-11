//package com.springboot_security_demo.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
////Configuration Given
//
//@Configuration
//@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
//public class ConfigByUser extends WebSecurityConfigurerAdapter{
//	
//	@Autowired
//	DataSource dataSource;
//	
//	@Override
//	protected void configure (HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//		.anyRequest()
//		.fullyAuthenticated()
//		.and()
//		.formLogin()
//		.loginPage("/login")
//		.failureUrl("/login?error")
//		.permitAll()
//		.and()
//		.logout()
//		.logoutUrl("/logout")
//		.logoutSuccessUrl("/login?logout")
//		.permitAll()
//		.and()
//		.csrf();
//	}
//	
//	@Override
//	protected void configure (AuthenticationManagerBuilder auth) throws Exception {
//		auth.jdbcAuthentication()
//		.dataSource(dataSource)
//		.passwordEncoder(passwordEncoder());
//	}
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		PasswordEncoder encoder = new BCryptPasswordEncoder();
//	     return encoder;
//	}
//}
