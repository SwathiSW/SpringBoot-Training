package com.springboot_login_module_from_database.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.springboot_login_module_from_database.model.CompanyUser;
import com.springboot_login_module_from_database.repository.UserRepository;

@Service
public class CustomUserDetails implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3915478320055770987L;

	@Autowired
	private UserRepository repository;
	private User user;

	public CustomUserDetails(CompanyUser user2) {
		repository.findByEmail(getPassword());
//        super();
//        this.repository = repository;
//        this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String toString() {
		return "CustomUserDetails [user=" + user + "]";
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
	}

	public CustomUserDetails() {
		super();
	}
	

}
