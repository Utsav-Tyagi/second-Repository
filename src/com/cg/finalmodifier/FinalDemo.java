package com.cg.finalmodifier;

 /*final*/ class Parent { //making Parent class final will not allow Child to extend
	
		public /* final */ void hello() { //making method as final whill not allow child class to override
		System.out.println("In Parent");
	}
}

class Child extends Parent{
	
	static final double  PI = 3.142;//final variable value can't be changed
	
	
	public void hello() {
		//PI = 4;
		System.out.println("In child");
	}
}

public class FinalDemo{
	public static void main(String[] args) {
		
		
	}
	
}
