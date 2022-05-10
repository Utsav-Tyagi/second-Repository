package com.cg.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Vector;

public class setex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> s1 = new HashSet<String>();
		s1.add("hgh");
		s1.add("tty");
		boolean b1=s1.add("ab");
		boolean b2=s1.add("ab");
		s1.add("ghgh");
		s1.add("hghhh");
		System.out.println(s1);
		System.out.println( b1 +" " +b2);
		
		System.out.println( "=================");
		 System.out.println( " ");
		/////* TreeSet*/////
		
		
		TreeSet<String> s2 =new TreeSet<String>();
		s2.add("aaaa");
		s2.add("ddd");
		b1=s2.add("ab");
		b2=s2.add("ab");
		s2.add("zzz");
		s2.add("zzz");
		s2.add("hghhh");
		
		System.out.println(s2);
		System.out.println( b1 +" " +b2);
		
		
		System.out.println( "=================");
		 System.out.println( " ");
		
	  /////* LinkedHashSet*/////
		  LinkedHashSet<String> set=new LinkedHashSet<String>();  
          set.add("One");    
          set.add("Two");    
           b1=set.add("ab");
  		 b2=set.add("ab");
          set.add("Four");    
          set.add("Five");  
          set.add("Three"); 
          System.out.println(set); 
          System.out.println( b1 +" " +b2);
          
          
          System.out.println( "=================");
          System.out.println( " ");
          
      /////* Vector  */////
          Vector<String> ab =new Vector<String>();
          ab.add("One");    
          ab.add("Two");    
          ab.add("Two");
          ab.add("Four");    
          ab.add("Five");  
          ab.add("Three");
          
          System.out.println(ab);
		
		
	}

}
