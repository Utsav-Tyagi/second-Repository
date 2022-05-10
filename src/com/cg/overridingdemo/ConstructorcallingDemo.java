package com.cg.overridingdemo;

class A {

	public A() {
		super();
		System.out.println("In A");
	}

}

class B extends A {

	public B() {
		super();
		System.out.println("In B");
	}
}

class C extends B {
	public C() {
		super();
		System.out.println("In C");
	}

}

public class ConstructorcallingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();

	}

}
