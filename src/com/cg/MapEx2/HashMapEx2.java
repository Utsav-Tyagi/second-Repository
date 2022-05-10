package com.cg.MapEx2;

 
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEx2 {

	public static void main(String[] args) {
		
		
	 HashMap<Student, Marksheet> map= new HashMap<>();
	 map.put(new Student(101,"A","X"), new Marksheet(90,80,70));
	 map.put(new Student(102,"B","IX"), new Marksheet(90,80,70));
	 map.put(new Student(103,"C","XI"), new Marksheet(90,80,70));
	 map.put(new Student(104,"D","XII"), new Marksheet(90,80,70));
     map.put(new Student(105,"E","V"), new Marksheet(90,80,70));
	 
	 
	 
	
	 Set<Entry<Student, Marksheet>>  rows=  map.entrySet();
		System.out.println("**************");
	System.out.println("Key -----------Value");
	for(Entry<Student, Marksheet> row :rows) {
		Student k=row.getKey();
		Marksheet v=row.getValue();
		System.out.println(k+"---------"+v);
	}
	 
     
	}

}
