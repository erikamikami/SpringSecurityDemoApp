package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/top")
public class TopController {
	
	@RequestMapping("")
	public String toTop() {
		return "top";
	}
	
}
