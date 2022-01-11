package com.example.todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private List<Todo> todos =  new ArrayList<>(Arrays.asList(
        new Todo("1","Buy my food",true),
        new Todo("2","Buy my chips",false)
    ));

    public List<Todo> getTodos() {
        return todos;
    }

    public Todo getTodo(String id) {	
		return todos.stream().filter(todo -> todo.getId().equals(id)).findFirst().get();
	}

    public void addTodo(Todo todo) {	
		todos.add(todo);
	}
    
}
