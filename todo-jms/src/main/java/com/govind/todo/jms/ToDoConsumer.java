package com.govind.todo.jms;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.govind.todo.domain.ToDo;
import com.govind.todo.repository.ToDoRepository;

@Component
public class ToDoConsumer {
	private Logger log = LoggerFactory.getLogger(ToDoConsumer.class);
	private ToDoRepository repository;

	public ToDoConsumer(ToDoRepository repository) {
		this.repository = repository;
	}

	@JmsListener(destination = "${todo.jms.destination}", containerFactory = "jmsFactory")
	public void processToDo(@Valid ToDo todo) {
		log.info("Consumer> " + todo);
		log.info("ToDo created> " + this.repository.save(todo));
	}
}
