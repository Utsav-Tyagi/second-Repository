package com.cg.threads;

public class FileDownloader implements Runnable {

	 
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("file Downloader thread start working......");
		for(int i=1;i<=10;i++) {
			System.out.println("Child :" +i);
		}
	}

}
