package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> nameOfStudent= new LinkedList<>();
		nameOfStudent.add("manaz");
		nameOfStudent.add("abhi");
		nameOfStudent.add("ujjwal");
		nameOfStudent.add("ashwin");
		nameOfStudent.add("aryan");
		nameOfStudent.add("adarsh");
		System.out.println(nameOfStudent);
		
		List<String> alist=new ArrayList<>(nameOfStudent);
		alist.add("viraj");
		System.out.println(alist);
		}

}
