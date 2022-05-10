package com.cg.collections;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"A", "Noida");
		Employee e2=new Employee(102,"B", "Gurugram");
		Employee e3=new Employee(103,"C", "Bangalore");
		Employee e4=new Employee(104,"D", "Chennai");
		Employee e5=new Employee(105,"E", "Delhi");
		Employee e6=new Employee(102,"F", "abcd");
		
		HashSet<Employee> set =new HashSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		System.out.println("no of elements :" + set.size());
		System.out.println(" ");
		for(Employee a:set)
		System.out.println(a);
		int n=10;
		int hash=e2.hashCode();
		int r=(n - 1) & hash;
		System.out.println(r);
		// TODO Auto-generated method stub

	}

}
