package com.cg.threads;

public class MultipleThreadsArrayIterationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4,54,87,5,6,7,8,45,67,89,23,45,67,
				8,70,45,67};
		Task2 task=new Task2();
		task.setArr(arr);
		
		//create 2 threads and start it
		Thread t1= new Thread(task);
		Thread t2= new Thread(task);
		t1.setName("Thread A");t2.setName("Thread B");
		t1.start();
		t2.start();
		
		
		}
		
	}


