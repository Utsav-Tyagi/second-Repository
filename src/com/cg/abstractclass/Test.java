package com.cg.abstractclass;

public class Test {

	public static void main(String[] args) {
		Car c= new Car("cgggggm","vh",15,145.5,true);
		Bike b=new Bike("hgjh","bbh",40,75000,true);
		System.out.println(Bike.price);
		c.drive();
		b.drive();
		
		
		// TODO Auto-generated method stub

	}

}
