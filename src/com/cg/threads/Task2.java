package com.cg.threads;

 

public class Task2 implements Runnable{
private int arr[];

	public int[]getArr(){
		return arr;
		
	}
	public void setArr(int[] arr)
	{
		this.arr = arr;
	}
	public void run() {
		Thread t=Thread.currentThread();
		for(int i=0;i<arr.length;i++) {
			System.out.println(t.getName()+ " "+i+ " "+ arr[i]);
		}
	}
}
