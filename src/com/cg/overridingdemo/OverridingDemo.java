package com.cg.overridingdemo;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal anmObj = new Animal();
		//Kitten kitten = new Kitten();
		anmObj.eat();
		anmObj = new Cat();
		anmObj.eat();
		
		anmObj = new Dog(); 
		anmObj.eat();
		
		
		/* This assig throws classcastException
		 * Cat catObj = new Cat(); //catObj = (Cat) anmObj;
		 */		

	
		
	}

}

