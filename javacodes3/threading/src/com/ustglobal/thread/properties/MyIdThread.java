package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {
	public static void main(String[] args) {
		System.out.println("Main started");

		System.out.println(Thread.currentThread().getId());

		MyIdThread mi = new MyIdThread();
		System.out.println("my id thread "+mi.getId());

        System.out.println("piority "+Thread.currentThread().getPriority());
       // Thread.currentThread().setPriority(16); IllegalArgumenExcepion
		System.out.println("main ended");

	}

}
