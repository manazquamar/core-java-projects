package com.map;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		Student s=new Student(100, "manaz", 45);
		Student s1=new Student(101, "ashwin", 65);
		Student s2=new Student(102, "abhi", 45);
		Student s3=new Student(103, "amkit", 65);
		Student s4=new Student(100, "sumit", 56);
		
		Map<Student,String> hmap= new HashMap<>();	
		hmap.put(s, "dps");
		hmap.put(s1, "dps");
		hmap.put(s2, "sfpu");
		hmap.put(s3, "iimt");
		hmap.put(s4, "jps");
		 System.out.println(hmap);
	}

}
