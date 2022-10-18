package com.comparableDemo;

public class Student implements Comparable<Student> {


	private int id;
	private String Name;
	private Integer marks;
	public Student(int id, String name, Integer marks) {
		super();
		this.id = id;
		Name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.marks.compareTo(o.marks);
	}

	
}
