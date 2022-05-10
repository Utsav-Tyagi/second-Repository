package com.cg.collections;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Vector provides dynamic array*/
		Vector<String> v1= new Vector<String>();

		System.out.println("intital capacity :" + v1.capacity());
		
		Vector<String> v2= new Vector<String>(3,10);
		System.out.println("intital capacity :" + v2.capacity());
	    v2.add("Noida");
	    v2.add("Delhi");
	    v2.add("abcd");
	    v2.add("3456");
	    v2.add("hijk");
	    
	    
	   
	    System.out.println(v2);
	    System.out.println("No of elements :" + v2.size());
	    System.out.println("now  capacity :" + v2.capacity());
	   
	    for(String s:v2) {
	    	System.out.println(s);
	    }
	    v2.add(1, "kolkata");
	 
	    System.out.println(v2);
	    System.out.println("No of elements :" + v2.size());
	}

}
