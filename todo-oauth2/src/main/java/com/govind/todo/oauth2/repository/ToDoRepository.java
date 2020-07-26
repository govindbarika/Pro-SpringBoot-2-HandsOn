package com.govind.todo.oauth2.repository;

import org.springframework.data.repository.CrudRepository;

import com.govind.todo.oauth2.domain.ToDo;

public interface ToDoRepository extends CrudRepository<ToDo, String> {

}
