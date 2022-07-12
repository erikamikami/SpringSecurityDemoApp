package com.example.domain;

public class User {
	private int id;
	private String name;
	private String password;
	private int attribute_id;
	
	public User(int id, String name, String password, int attribute_id) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.attribute_id = attribute_id;
	}
	
	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAttribute_id() {
		return attribute_id;
	}

	public void setAttribute_id(int attribute_id) {
		this.attribute_id = attribute_id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", attribute_id=" + attribute_id + "]";
	}
	
}
