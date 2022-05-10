package com.cg.threads;

public class ProjectManagerEx2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ConferenceRoomBookingJobEx2 check1= new ConferenceRoomBookingJobEx2();
		 
		Thread t1=new Thread(check1);
		Thread t2=new Thread(check1);
		Thread t3=new Thread(check1);
		
		t1.setName("Person A ");
		t2.setName("Person B ");
		t2.setName("Person c ");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		 
	}

}
