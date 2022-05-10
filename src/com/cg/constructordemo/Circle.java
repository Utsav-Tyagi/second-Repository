package com.cg.constructordemo;

import java.util.Scanner;

public class Circle{

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void calculateArea() {
		double area = 3.14*getRadius()*getRadius();
		System.out.println("ARea of circle " + area);
	}

public static void main(String[] args) {
		Circle circle = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter radius");
		/*
		 * double radius = sc.nextDouble(); circle.setRadius(radius);
		 */
		circle.setRadius(sc.nextDouble());
		circle.calculateArea();
		
		System.out.println( circle instanceof Circle);
}
	
}


