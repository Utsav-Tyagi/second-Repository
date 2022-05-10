package com.cg.collections;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(22,"A","HTML");
		Student s2=new Student(23,"Z","JAVA");
		Student s3=new Student(24,"E","SQL");
		Student s4=new Student(25,"C","C");
        Student s5=new Student(26,"B","C++");
		Student s6=new Student(25,"D","C");
		Student s7=new Student(22,"A","HTML");
		
		TreeSet<Student> set =new TreeSet<Student>(new CompareByName());
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
//		set.add(s6);
//		set.add(s7);
		
		for(Student s:set) {
			System.out.println(s);
		}
		
	}

}
