package com.brecnis.learn.entities;

public class SimpleRecord {
	private String firstName;
	private int id;
	
	public SimpleRecord(String firstName, int id) {
		super();
		this.firstName = firstName;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "SimpleRecord [firstName=" + firstName + ", id=" + id + "]";
	}
}
