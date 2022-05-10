package com.cg.collections;

import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		Vector<Product> v1 =new Vector<Product>();
        Product p1=new Product(111, "teddy ", 55300, 4.6f);
        v1.add(p1);
        Product p2=new Product(222, "car ", 505430, 78.6f);
        v1.add(p2);
        Product p3=new Product(333, "bike ", 51500, 6.6f);
        v1.add(p3);
        Product p4=new Product(444, "cycle ", 422, 3.6f);
        v1.add(p4);
        Product p5=new Product(555, "mobilr ", 55300, 1.6f);
        v1.add(p5);
        
        for(Product a: v1) {
        	 System.out.println(a);
        }
       
		
		
		 
		// TODO Auto-generated method stub

	}

}
