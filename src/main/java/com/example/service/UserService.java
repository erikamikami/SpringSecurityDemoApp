package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	/**
	 * User情報 全件表示
	 * 
	 * @return
	 */
	public List<User> findAll(){
		return userRepository.findAll();
	}

	public void insert(String name, String password, int attributeId) {
		userRepository.insert(name, password, attributeId);
	}

}
