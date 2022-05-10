package com.cg.collections;

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		Vector<Integer> v1 =new Vector<Integer>();		
		
		
		System.out.println("intital capacity :" + v1.capacity());
		
		Vector<Integer> v2= new Vector<Integer>(3,10);
		System.out.println("intital capacity :" + v2.capacity());
		v2.add(12);
		v2.add(142);
		v2.add(162);
		v2.add(182);
		 
	   
	    System.out.println(v2);
	    System.out.println("No of elements :" + v2.size());
	    System.out.println("now  capacity :" + v2.capacity());
//	   
	     
	    
	}

}
