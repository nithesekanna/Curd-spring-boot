package com.example.update.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;


@Entity
public class Student {
	@Id
	private int id;
	@NotNull(message = "username shouldn't be null")
	private String name;
	public Student() {
		
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "RequestStudent [id=" + id + ", name=" + name + "]";
	}
}
