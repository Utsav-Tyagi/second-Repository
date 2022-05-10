package com.cg.threads;

public class MainThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Thread Started");
		FileDownloader downloader =new FileDownloader();
		Thread t= new Thread(downloader);
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main :" +i);
		}
		System.out.println("Main Thread Ends......");

	}

}
