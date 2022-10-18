package com.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class MainClass {

	public static void main(String[] args) {
		Employ el=new Employ(102,"manaz" );
		Employ e2=new Employ(103,"ashwin" );
		Employ e3=new Employ(104,"ujwal");
		Employ e4=new Employ(105,"aryan" );
		Employ e5=new Employ(106,"manaz" );
		
		List<Employ> list= new ArrayList<>();
		
		
	    list.add(el);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
//		Collections.sort(list,Collections.reverseOrder((x,y)->x.getId()- y.getId()));
//		System.out.println(list);
		
		Set<Employ>set=list.stream().collect(Collectors.toSet());
		System.out.println(set);
	}

}
