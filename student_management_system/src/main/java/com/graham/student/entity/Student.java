package com.graham.student.entity;

public class Student {
	private Long id;
	private String firstname;
	private String lastName;
	private String email;
	
	
	//constructor using fields
	public Student(String firstname, String lastName, String email) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
	}
	
	//getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
