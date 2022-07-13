package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserForm {
	
	@NotBlank(message = "※入力必須")
	private String name;

	@NotBlank(message = "※入力必須")
	private String password;

	@NotNull(message = "※入力必須")
	private Integer attributeId;

	public UserForm(String name, String password, Integer attributeId) {
		super();
		this.name = name;
		this.password = password;
		this.attributeId = attributeId;
	}

	public UserForm() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}

	@Override
	public String toString() {
		return "UserForm [name=" + name + ", password=" + password + ", attributeId=" + attributeId + "]";
	}
	
	

}
