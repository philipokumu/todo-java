package com.example.todo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
public class TodoController {

    @Autowired
	// private TodoService todoService;
    
    @RequestMapping("/todos")
    public List<Todo> getAllTodos() {
        return Arrays.asList(
            new Todo("1","Buy my food",true),
            new Todo("2","Buy my internet",true)
        );
    }


    // @RequestMapping("/todos/{id}")
    // public String getTodo(@PathVariable String id) {
    //     return List.of("todo1","todo2");
    // }
    
}
