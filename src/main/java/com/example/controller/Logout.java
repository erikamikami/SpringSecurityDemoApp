package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logout")
public class Logout {
	
	@RequestMapping("")
	public String toLogout() {
		return "logout";
	}

	@RequestMapping("/require")
	public String logout() {
		return "/top";
	}
	
}
