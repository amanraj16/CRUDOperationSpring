package com.capgemini.beans;

public class Employee {
	private String id;
	private String designation;
	private String name;
	private double salary;
	public String getId() {
		return id;
	}
	public Employee(String id, String designation, String name, double salary) {
		super();
		this.id = id;
		this.designation = designation;
		this.name = name;
		this.salary = salary;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
