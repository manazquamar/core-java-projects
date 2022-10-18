package com.comparableDemo;

public class MainClass {

	public static void main(String[] args) {


		Student s1=new Student(102 ,"maanz" ,  590);
		Student s2=new Student(103 ,"abhi" ,650  );
		
		System.out.println(s1.compareTo(s2));
	}

}
