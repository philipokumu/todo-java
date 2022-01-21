package com.example.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
	private TodoRepository todoRepository;

    // private List<Todo> todos =  new ArrayList<>(Arrays.asList(
    //     new Todo("1","Buy my food",true),
    //     new Todo("2","Buy my chips",false)
    // ));

    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodo(String id) {	
        return todoRepository.
        findById(id).orElse(null);
		// return todos.stream().filter(todo -> todo.getId().equals(id)).findFirst().get();
	}

    public void addTodo(Todo todo) {	
        todoRepository.save(todo);
		// todos.add(todo);
	}

    public void updateTodo(String id, Todo todo) {	
        todoRepository.save(todo);
        return;
        // for (int i=0; i < todos.size(); i++) {
        //     Todo t = todos.get(i);
        //     if (t.getId().equals(id)) {
        //         todos.set(i,todo);
        //     }
        // }
	}

    public void deleteTodo(String id) {	
        todoRepository.deleteById(id);
        // todos.removeIf(todo -> todo.getId().equals(id));
	}
}
