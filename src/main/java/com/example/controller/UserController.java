package com.example.controller;

import java.beans.Beans;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserForm;
import com.example.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	private UserForm setUpUserForm() {
		return new UserForm();
	}

	@RequestMapping("/list")
	public String showUserList(Model model) {
		List<User> userList = userService.findAll();
		model.addAttribute("userList", userList);
		return "user/list";
	}

	@RequestMapping("/createForm")
	public String showCreateForm() {
		return "user/create";
	}

	@RequestMapping("/createInsert")
	public String checkCreateForm(@Validated UserForm userForm, BindingResult result) {
		if (result.hasErrors()) {
			return "user/create";
		}

		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		userService.insert(user.getName(), user.getPassword(), user.getAttributeId());
		return "redirect:/user/list";
	}
}
