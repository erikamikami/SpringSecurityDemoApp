package com.example.domain.auth;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("tom".equals(username)) {
			return new CustomUserDetails("tom", "password", Collections.emptyList());
		}
		throw new UsernameNotFoundException("Noooo!!!");
	}


}
