package com.cg.threads;

public class DataShareEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyTask1 task =new MyTask1();
		Thread t1= new Thread(task);
		Thread t2= new Thread(task);
		//here main thread should wait for another thread 
		// to complete the job
		 t1.start();//Runnable
		 t2.start();//Runnable
		 
		 
		 t1.join();
		 t2.join();
		 //here main thread gets the computation result out of child
		 System.out.println(task.getData());
		
	}

}
