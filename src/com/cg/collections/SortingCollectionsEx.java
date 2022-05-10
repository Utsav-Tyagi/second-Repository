package com.cg.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollectionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
            
           
          
           Collections.sort(prodList);
           System.out.println("ArrayList  After sorted based on price is");
           for(Product p: prodList) {
             	 System.out.println(p);
             }
           
           
           System.out.println("****************");
           System.out.println("****************");
           System.out.println("****************");
           System.out.println("****************");
           
           SortProductName sort_name= new SortProductName();
           
		   Collections.sort(prodList,sort_name);
           
           for(Product p: prodList) {
           	 System.out.println(p);
           }
           
	}
}
