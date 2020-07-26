package com.govind.todo.repository;

import org.springframework.data.repository.CrudRepository;

import com.govind.todo.model.ToDo;

public interface ToDoRepository extends CrudRepository<ToDo, String> {

}
