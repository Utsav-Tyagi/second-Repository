package com.cg.constructordemo;

public class Shape {

	private double length;
	private double breadth;

	// Constructor
	public Shape(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	//Getters
	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void calArea(double length, double breadth) {
		System.out.println("In shape class AreaMeth");
	}
}

class Triange extends Shape {
	private double height;

	public Triange(double length, double breadth, double height) {
		super(length, breadth);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}


	public void calArea(double length, double breadth, double height) {
		double area = length * breadth * height;
		System.out.println("The area of Triangle is " + area);
	}

}
