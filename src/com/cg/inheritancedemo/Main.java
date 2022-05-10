package com.cg.inheritancedemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animalObj = new Animal();
		animalObj.name ="noName";
		animalObj.habitat="noHabitat";
		animalObj.noOfLegs = 4;
		animalObj.eat();
		animalObj.sleep();
		animalObj.display();
		
		
		/* ******Child class********* */
		
		Cat catObj = new Cat();
		catObj.color ="Black";
		catObj.name ="Tom";
		catObj.noOfLegs = 4;
		catObj.habitat ="home";
		System.out.println("****Displaying Cat Details***************");
		catObj.display();
		catObj.eat();
		catObj.meow();
		
		/* ***Creating Object's**** */
		
		  System.out.println("?************Cat of Animal Type***************");
		  Animal anmObj = new Cat(); 
		  anmObj.eat();
		  
		  anmObj= new Dog();
		  anmObj.eat();
		  
		  anmObj = new PuppyDog();
		  anmObj.eat();
		  
		 
		System.out.println("Checking instance of " + (animalObj instanceof Animal));
		

	}

}
