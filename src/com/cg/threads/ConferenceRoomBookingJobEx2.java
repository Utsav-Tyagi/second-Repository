package com.cg.threads;

public class ConferenceRoomBookingJobEx2  implements Runnable{
	
	private boolean isAvailable=true;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Book();
	}
 
	synchronized void Book(){
		Thread a= Thread.currentThread();
		Thread t= Thread.currentThread();
		
		
		if(isAvailable()) {
			
			if(isAvailable()) {
			System.out.println(a.getName()+ "Booking");
			isAvailable=false;
			System.out.println("Booked for " + a.getName());
			System.out.println(  " confernce room1  Already Booked");
			
			}
			
			else
			{
				System.out.println(t.getName()+ "Already Booked confernce room1");
			}
			 
			
		   System.out.println(t.getName()+ "Booking");
		   isAvailable=false;
		   System.out.println(" Booked for " + t.getName());
		   
				
			
		}
		else
		{
			System.out.println(  t.getName()+ " Sorry Already Booked confernce room");
		
		
	}
	}
	boolean isAvailable() {
		return isAvailable;
	}
	
}
