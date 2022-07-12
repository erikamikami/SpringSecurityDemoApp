package com.example.form;

public class UserForm {
	
	private String name;
	private String password;
	
	public UserForm(String name, String password) {
		super();
		this.name = name;
		this.password = password;
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
	
	@Override
	public String toString() {
		return "UserForm [name=" + name + ", password=" + password + "]";
	}

}
