package com.cg.abstractclass2;

public class Triangle extends Shape {

	   
	
		public Triangle(double val1, double val2) {
			super(val1,val2);
		}
	
	double calArea() {
		double area=(1/2.0)*val1*val2;
		return area;
	}

}
