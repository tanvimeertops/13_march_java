package com.thread;
/*
 * Thread: 
 * simple light weight process
 * 
 * main is a thread
 * single thread:
 *  
 * multi thread/multi processing/multi tasking
 * 
 * thread life cycle:
 * 1.newborn
 * 2.runnable
 * 3.running
 * 4.blocked
 * 5.dead
 * 
 * can be achieved with class and interface
 * 
 */
class FirstDemo extends Thread{
	
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("this is first thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class ThreadDemo {
public static void main(String[] args) {
	FirstDemo fd=new FirstDemo();
	fd.start();
	
	for (int i = 0; i <5; i++) {
		System.out.println("this is main thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
