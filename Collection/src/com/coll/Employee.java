package com.coll;

public class Employee {
	
	private String name ;
	private Integer sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}
	public Employee(String name, Integer sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	

}
