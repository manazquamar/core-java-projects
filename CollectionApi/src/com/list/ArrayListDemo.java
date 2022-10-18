
 
package com.list;

import java.util.ArrayList;

public class ArrayListDemo {
	  
	  public static void main(String[] args) {
		
		  ArrayList<String> list= new ArrayList<String>();
		  list.add("abc");
		  list.add("hgf");
		  list.add("hjk");
		  list.add("fgh");
		  list.add("bcd");
		  list.add("fgh");
		  list.add("ghf");
		  list.add("fgh");
		  list.add("hjk");
		  list.add(9,"manish");
		  
		  System.out.println(list);
		  
		  list.remove ("hjk");
		  
		  System.out.println(list);
	  }

}
