package com.cg.threads;

public class MyTask1 implements Runnable{

	 int data=99;
	 public void run() {
		 System.out.println("Run Method");
		 data=data+10;
	 }
	 int getData() {
		 return data;
	 }
}
