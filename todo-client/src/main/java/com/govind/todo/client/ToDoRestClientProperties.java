package com.govind.todo.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "todo")
//@Data
public class ToDoRestClientProperties {
	private String url;
	private String basePath;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public ToDoRestClientProperties(String url, String basePath) {
		super();
		this.url = url;
		this.basePath = basePath;
	}

	public ToDoRestClientProperties() {
		super();
	}

	@Override
	public String toString() {
		return "ToDoRestClientProperties [url=" + url + ", basePath=" + basePath + "]";
	}

}