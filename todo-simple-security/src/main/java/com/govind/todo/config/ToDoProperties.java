package com.govind.todo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "todo.authentication")
public class ToDoProperties {
	private String findByEmailUri;
	private String username;
	private String password;

	public ToDoProperties(String findByEmailUri, String username, String password) {
		super();
		this.findByEmailUri = findByEmailUri;
		this.username = username;
		this.password = password;
	}

	public ToDoProperties() {
		super();
	}

	public String getFindByEmailUri() {
		return findByEmailUri;
	}

	public void setFindByEmailUri(String findByEmailUri) {
		this.findByEmailUri = findByEmailUri;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ToDoProperties [findByEmailUri=" + findByEmailUri + ", username=" + username + ", password=" + password
				+ "]";
	}

}
