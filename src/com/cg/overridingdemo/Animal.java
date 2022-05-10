package com.cg.overridingdemo;

class Animal {

	public void eat() {
		System.out.println("Animal eats");
	}
}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("Cat eats");
	}
}

class Dog extends Animal {

	public void eat() {
		System.out.println("Dog eats");
	}

}
