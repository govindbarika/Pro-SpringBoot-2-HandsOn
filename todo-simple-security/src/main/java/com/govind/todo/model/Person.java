package com.govind.todo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
	private String email;
	private String password;
	private String role;
	private boolean enabled;

	public Person() {
		super();
	}

	public Person(String email, String password, String role, boolean enabled) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Person [email=" + email + ", password=" + password + ", role=" + role + ", enabled=" + enabled + "]";
	}

}
