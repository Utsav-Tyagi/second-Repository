package com.cg.abstractclass2;

public abstract class Shape {
	double val1;
	double val2;
    abstract double calArea();
	
	 
	
	public Shape(double val1, double val2) {
		super();
		this.val1=val1;
		this.val2=val2;
	}
	void displayShapeName(String shape) {
		System.out.println("Name of shape is "+ shape);
	}
	 
}
