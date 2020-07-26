package com.govind.todo.domain;

import java.time.LocalDateTime;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import lombok.Data;

//@Data
public class ToDo {
	@NotNull
	private String id;
	@NotNull
	private String description;
	Boolean completed;
	LocalDateTime created;
	LocalDateTime modified;

	public ToDo() {
		LocalDateTime date = LocalDateTime.now();
		this.id = UUID.randomUUID().toString();
		this.created = date;
		this.modified = date;
	}

	public ToDo(String description) {
		this();
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean isCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getModified() {
		return modified;
	}

	public void setModified(LocalDateTime modified) {
		this.modified = modified;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", description=" + description + ", completed=" + completed + ", created=" + created
				+ ", modified=" + modified + "]";
	}

	
}
