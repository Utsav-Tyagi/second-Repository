package com.cg.threads;

public class ConferenceRoomBookingJob implements Runnable {
	private boolean isAvailable=true;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Book();
	}
 
	synchronized void Book(){
		Thread t= Thread.currentThread();
		
		if(isAvailable()) {
			
			System.out.println(t.getName()+ "Booking");
			isAvailable=false;
			System.out.println("Booked for " + t.getName());
		}
		else
		{
			 
			System.out.println(t.getName()+ " Sorry Room Already Booked "   );
		 
		}
		
	}
	
	boolean isAvailable() {
		return isAvailable;
	}
	

}
