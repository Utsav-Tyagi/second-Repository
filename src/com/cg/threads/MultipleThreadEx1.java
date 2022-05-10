package com.cg.threads;

public class MultipleThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World....");
		Thread t= Thread.currentThread();
		System.out.println("Current Running Thread is "+ t.getName());
		t.setName("CG");
		System.out.println("Current Running Thread is "+ t.getName());
		System.out.println("Default Priority "+ t.getPriority());
		t.setPriority(9);
//		t.start();
		System.out.println("updated priority is "+t.getPriority());
		System.out.println(t);
		
		for(int i=1;i<=20;i++) {
//			try {
//				Thread.sleep(1000);
//			}catch (InterruptedException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
			System.out.println(i);
		}

	}

}
