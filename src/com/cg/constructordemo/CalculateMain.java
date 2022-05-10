package com.cg.constructordemo;

public class CalculateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape(10,5);
		
		Triange triObj = new Triange(20, 10, 5);
		triObj.calArea(triObj.getLength(), triObj.getBreadth(), triObj.getHeight());
		
	}

}
