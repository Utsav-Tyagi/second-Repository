package com.cg.overridingdemo;

class Parent{
	private int id;
	private String name;
	
	public Parent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Parent [id=" + id + ", name=" + name + "]";
	}
	
}

class Child extends Parent{
	
	private int score;
	private String location;
	
	public Child(int id, String name, int score, String location) {
		super(id, name);
		this.score = score;
		this.location = location;
	}

	@Override
	public String toString() {
	return super.toString() +"Child [score=" + score + ", location=" + location + "]";
	}
	
}


public class ConstructoParameterPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child = new Child(10,"Priya",100, "Bangalore");
		System.out.println(child);
	}

}
