package com.cg.threads;

public class ProjectManager {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ConferenceRoomBookingJob check=new ConferenceRoomBookingJob();

		Thread t1=new Thread(check);
		Thread t2=new Thread(check);
		t1.setName("Person A ");
		t2.setName("Person B ");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		 
	}

}
