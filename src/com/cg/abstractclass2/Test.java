package com.cg.abstractclass2;

public class Test {

	public static void main(String[] args) {
		Rectangle ab =new Rectangle(20,4);
		Triangle cd= new Triangle(10,2);
		
		ab.displayShapeName("Rectangle");
		System.out.println(ab.calArea());
		
		cd.displayShapeName("Triangle");
		System.out.println(cd.calArea());
		// TODO Auto-generated method stub

	}

}
