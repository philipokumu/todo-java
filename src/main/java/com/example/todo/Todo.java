package com.example.todo;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Todo {

    // @Id
	private String id;
	private String description;
	private boolean isCompleted;
	private Date created_at;

    public Todo(){
        
    }

    public Todo(String id, String description, boolean isCompleted) {
		super();
		this.id = id;
		this.description = description;
		this.isCompleted = isCompleted;
		this.created_at = new Date(System.currentTimeMillis());
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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    
    
}
