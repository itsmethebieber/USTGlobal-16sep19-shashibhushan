package com.ustglobal.thread.pausing;

public class Sleep {
	public static void main(String[] args) {
		System.out.println("main started");
		
		for(int i=0;i<10;i++);
		System.out.println("sliding");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
