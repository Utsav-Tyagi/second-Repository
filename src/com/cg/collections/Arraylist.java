package com.cg.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 

public class Arraylist {

	public static void main(String[] args) {
		
		 
		
		ArrayList<Integer> s1=new ArrayList<Integer>();		
		s1.add(12);
		s1.add(122);
		s1.add(132);
//		 int len1=s1.size();
		 for (int i :s1) {
	           
             
	            System.out.print(i +" "); 
		}
		 System.out.println( "  ");
	System.out.println( "==================== ");
//	System.out.println(s1.get(1)); 
	
	
	ArrayList<String> s2=new ArrayList<String>();		
	s2.add("abc");
	s2.add("cba");
	s2.add("bca");
	System.out.println("Before sorted is");
	 System.out.println(s2);
	 System.out.println( "  ");
 Collections.sort(s2);
 System.out.println("After sorted is");
 System.out.println(s2);
 
 
	 System.out.println( "==================== ");

	
        List<Integer> numbers = Arrays.asList(90,14, 72, 003,
                                       84, 45);
 
        int len=numbers.size();
        Collections.sort(numbers);
        for (int i = 0; i < len; i++)
           
        {
            System.out.print(numbers.get(i) + " "); 
	}
        

   	 System.out.println( "==================== ");
   	System.out.println( "==================== ");
        
       
        Product p1=new Product(111, "teddy ", 55300, 4.6f);
        
        Product p2=new Product(222, "car ", 505430, 78.6f);
       
        Product p3=new Product(333, "bike ", 51500, 6.6f);
        
        Product p4=new Product(444, "cycle ", 422, 3.6f);
        
        Product p5=new Product(555, "mobilr ", 55300, 1.6f);
        
        ArrayList<Product> prodList=new ArrayList<Product>();	
        prodList.add(p1);
        prodList.add(p2);
        prodList.add(p3);
        prodList.add(p4);
        prodList.add(p5);
        
        
       
        for(Product p: prodList) {
       	 System.out.println(p);
       }
         
        System.out.println("ArrayList  After sorted is");
       
        Collections.sort(prodList);
        for(Product p: prodList) {
          	 System.out.println(p);
          }
        
        

}
}