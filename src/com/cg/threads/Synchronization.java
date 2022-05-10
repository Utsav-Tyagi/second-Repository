package com.cg.threads;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Banking bank=new Banking();

		Thread t1=new Thread(bank);
		Thread t2=new Thread(bank);
		t1.setName("ATM");
		t2.setName("G Pay");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Bal Amt"+ bank.getBalanceAmt());
		
	}

}
