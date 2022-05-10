package com.cg.abstractclass;


abstract public class Vehicle {
	int regno,mileage,price;
	String vehicleName;
	abstract void Drive();
	void drive() {
		// TODO Auto-generated method stub
		
	}
}

//public class Vehicle {
//	
//	
//	public long regno;
//	public int mileage;
//	public String vehicle_name;
//	public int price;
//	  
//	  // Getter
//	  public String getColor() {
//	    return vehicle_name;
//	  }
//	  
//	  // Setter
//	  public void setColor(String c) {
//	    this.vehicle_name = c;
//	  }
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Vehicle v1 = new Vehicle();
//		  v1.setColor("dzire");
//		  System.out.println(v1.getColor());
//	}
//
//}
