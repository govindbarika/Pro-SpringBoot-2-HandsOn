package com.govind.todo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

//@Data
@ConfigurationProperties(prefix = "todo.jms")
public class ToDoProperties {
	private String destination;

	
	public ToDoProperties() {
		super();
	}

	public ToDoProperties(String destination) {
		super();
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "ToDoProperties [destination=" + destination + "]";
	}
	
	
}