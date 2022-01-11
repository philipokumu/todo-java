package com.example.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
public class TodoController {

    @Autowired
	private TodoService todoService;

    @RequestMapping("/todos")
    public List<Todo> getAllTodos() {
        return todoService.getTodos();
    }


    @RequestMapping("/todos/{id}")
    public Todo getTodo(@PathVariable String id) {
        return todoService.getTodo(id);
    }

    @PostMapping("/todos")
	public void addTodo(@RequestBody Todo todo) {
		todoService.addTodo(todo);
	}
    
}
