package com.example.todo;

public class Todo {

    // @Id
	private String id;
	private String description;
	private boolean isCompleted;

    public Todo(){
        
    }

    public Todo(String id, String description, boolean isCompleted) {
		super();
		this.id = id;
		this.description = description;
		this.isCompleted = isCompleted;
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

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    
    
}
