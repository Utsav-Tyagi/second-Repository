package com.cg.inheritancedemo;

public class Animal {
	 String name;
	 int noOfLegs;
	 String habitat;
	 
	 
	
		/*
		 * public Animal(String name, int noOfLegs, String habitat) { super(); this.name
		 * = name; this.noOfLegs = noOfLegs; this.habitat = habitat; }
		 */
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		System.out.println("All animals eat");
	}
	public void sleep() {
		System.out.println("All animals sleep");
	}
	public void display() {
		System.out.println(" Name " + name );
		System.out.println(" NoOFLegs " + noOfLegs);
		System.out.println(" habitat " +habitat);
		}

}
