package com.q2;

public class Employee {
int id;
 String name;
Integer salary;
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
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public Employee(int id, String name, Integer salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
}