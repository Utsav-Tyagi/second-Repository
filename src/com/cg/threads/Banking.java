package com.cg.threads;

public class Banking implements Runnable{
	float balanceAmt=5000;
	
//	public void run() {
//		debit(4000);
//		
//	}
	public void run() {
		synchronized (this) {
			debit(4000);
		}
	}
	
	void debit(int debitAmt) {
		Thread t= Thread.currentThread();
		if(balanceAmt>= debitAmt) {
		try {
			System.out.println(t.getName()+" goes to zzzzz");
			//Thread.sleep(4000);
			wait(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		balanceAmt=balanceAmt-debitAmt;
		
		System.out.println(t.getName()+" Successfully debited");
	}
//		if(balanceAmt>= debitAmt) {
//			System.out.println(t.getName()+ "ready to debit");
//			balanceAmt=balanceAmt-debitAmt;
//			System.out.println(t.getName()+ " successfully debited");
//		}
		else {
			System.out.println(t.getName()+ " Inufficients funds");
		}
		
}
	public float getBalanceAmt() {
		return balanceAmt;
	}

}
