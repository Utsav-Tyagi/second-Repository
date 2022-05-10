package com.cg.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
public static void main(String[] args) {
	ArrayList<Integer> list1= new ArrayList<Integer>();
	list1.add(99);
	list1.add(45);
	list1.add(65);
	list1.add(31);
	list1.add(37);
	
	System.out.println("------for each loop----------");
	for(int a:list1) {
		System.out.println(a);
	}
	
	System.out.println("-------------------------");
	
 Iterator<Integer>it=	 list1.iterator();
 while(it.hasNext()) {
	 int val=it.next();
	 System.out.println(val);
 }
}
}