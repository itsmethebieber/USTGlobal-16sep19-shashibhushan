package com.ustglobal.thread.defining;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		
		MyThread th = new MyThread();
		th.start();
		for(int i= 0;i<10;i++) {
			System.out.println(" main thread");
//   don't call run() method,it behaves like normal program
//			all code will be executed inside main thread  only
		}
		System.out.println("main ended");
		
	}

}
//ballo
