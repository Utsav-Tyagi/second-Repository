package com.cg.constructordemo;


class CalculateShape{
	
	public void calArea(int length,int breadth) {
		System.out.println(length +" " + breadth);
	}
	
	public void calArea(int length,int breadth,int height) {
		System.out.println(length +" " +breadth +" " +height);
	}
	
}

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateShape shapeObj = new CalculateShape();
		shapeObj.calArea(10, 20);
		shapeObj.calArea(10, 20, 8);

	}

}
