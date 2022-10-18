package com.q2;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1, "ashwin", 9000);
		Employee e2=new Employee(2, "ujwall", 15000);
		Employee e3=new Employee(3, "manaz", 8000);
		Employee e4=new Employee(4, "adarsh", 9500);
		Employee e5=new Employee(5, "aryan", 14000);
		
		
		Map<Employee,String> smap=new TreeMap<>((x,y)->x.getSalary()-y.getSalary());
		smap.put(e1,"1");
		smap.put(e2,"2");
		smap.put(e3,"3");
		smap.put(e4,"4");
		smap.put(e5,"5");
		
		System.out.println(smap);
		

	}

}
