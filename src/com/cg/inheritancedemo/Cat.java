package com.cg.inheritancedemo;

public class Cat extends Animal{
	
	/*
	 * public Cat(String name, int noOfLegs, String habitat) { super(name, noOfLegs,
	 * habitat); // TODO Auto-generated constructor stub }
	 */

	String color;
	public void meow() {
		System.out.println("Cat says meow meow");
	}
	
	//redefining eat method in cat class with diff implementation- M.Overriding
	
	public void eat() {
		System.out.println("Cat eats fish");
	}
	
	
	public void display() {
		super.display();
		System.out.println("Cat Color " + color);
		}
	
}
