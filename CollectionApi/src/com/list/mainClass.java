package com.list;

import java.util.LinkedList;
import java.util.List;

public class mainClass {

	public static void main(String[] args) {
   Student s1= new Student(1,"manaz",73);
   Student s2= new Student(2,"abhi",74);
   Student s3= new Student(3,"ujjwal",75);
   Student s4= new Student(4,"ashwin",76);
   Student s5= new Student(5,"aryan",77);
   
   List<Student> list = new LinkedList<>();
   list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
	System.out.println(list);
	}

}
