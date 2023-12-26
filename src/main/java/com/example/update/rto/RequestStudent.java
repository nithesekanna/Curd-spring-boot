package com.example.update.rto;

public class RequestStudent {

	private int id;
	private String name;
	public RequestStudent() {
		
	}
	public RequestStudent(int id, String name) {
		
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
