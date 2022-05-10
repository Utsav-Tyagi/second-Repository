package com.cg.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceTestListEx {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		long t1= System.currentTimeMillis();
		for(int i=1;i<100000;i++) {
			list1.add("hello");
		}
		System.out.println("t1  " + t1);
		long t2= System.currentTimeMillis();
		System.out.println("time taken for ArrayList " + (t2-t1));
		
		LinkedList<String> list2 = new LinkedList<String>();
		  t1= System.currentTimeMillis();
		for(int i=1;i<100000;i++) {
			list2.add("heucvjghllo");
		}
		System.out.println("t2  " + t2);
		t2= System.currentTimeMillis();
		System.out.println("time taken for LinkedList " + (t2-t1));
		// TODO Auto-generated method stub

	}

}
