package com.cg.threads;

public class WaitNotifyProducerConsumerExMain {
public static void main(String[] args) {
	Video v=new Video();
	Audio a=new Audio();
	v.setAudio(a);
	a.setVideo(v);
	Thread t1=new Thread(v);
	Thread t2=new Thread(a);
	t1.start(); t2.start();
}
static class Video implements Runnable{
	private Audio audio;
	
	public void setAudio(Audio audio) {
		this.audio = audio;
	}
	public void run() {
		playVideo();
	}
	synchronized void playVideo(){
		for (int i = 1; i <= 10; i++) {
			System.out.println("********** playing audio ****** " +i);
				synchronized (audio) {
					audio.notify();//ACQUIRE THE LOCK & unblock
				}//signal to waiting thread
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
static class Audio implements Runnable{
	Video video;

	public void setVideo(Video v) {
		this.video = v;
	}
	public void run() {
		playAudio();
	}
	synchronized void playAudio(){
		for (int i = 1; i <= 10; i++) {
			try {
				wait();//release the lock & block state
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("------ playing video -------"+i);
			synchronized (video) {// acquired the lock of video
				video.notify();// notify the thread
			}
		}
	}
	
}
}