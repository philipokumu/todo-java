package com.example.todo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	private String id;
	private String description;
	private boolean isCompleted;
    @Column(name = "`created_at`")
	@CreationTimestamp
	private Date created_at;

    public Todo(){
        
    }

    public Todo(String id, String description, boolean isCompleted) {
		super();
		this.id = id;
		this.description = description;
		this.isCompleted = isCompleted;
		// this.created_at = new Date(System.currentTimeMillis());
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
