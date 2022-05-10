package com.cg.collections;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(111, "NOIDA");
		map1.put(222, "GHAZIABAD");
		map1.put(333, "GURUGRAM");
		map1.put(444, "DELHI");
		map1.put(555, "MERUT");
		 for(int i=0;i<5;i++)
		System.out.println(map1);
		 map1.put(111, "NEW NOIDA");
		 System.out.println(map1);
		 String city=map1.get(555);
		 System.out.println(city);

		 boolean b= map1.containsKey(333);
		 System.out.println(b);
		 
		 Set<Integer> Keys =map1.keySet();
		 System.out.println("----------iterating value--------");
		 for(Integer k:Keys)
			 System.out.println(k);
		 
		 Collection<String> value = map1.values();
		 System.out.println("----------iterating value--------");
		 for(String v:value)
			 System.out.println(v);
		 
		 
		
		 
		 Set<Entry<Integer, String>>  rows=  map1.entrySet();
			System.out.println("**************");
		System.out.println("Key -----------Value");
		for(Entry<Integer, String> row :rows) {
			Integer k=row.getKey();
			String v=row.getValue();
			System.out.println(k+"---------"+v);
		}
	}

}
