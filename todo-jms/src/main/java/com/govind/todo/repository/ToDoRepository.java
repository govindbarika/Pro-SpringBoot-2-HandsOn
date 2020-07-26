package com.govind.todo.repository;

import org.springframework.data.repository.CrudRepository;

import com.govind.todo.domain.ToDo;

public interface ToDoRepository extends CrudRepository<ToDo, String> {

	@SuppressWarnings("unchecked")
	public ToDo save(ToDo todo);

}
