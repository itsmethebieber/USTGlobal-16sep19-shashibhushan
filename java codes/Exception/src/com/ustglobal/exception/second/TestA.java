package com.ustglobal.exception.second;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main ended");
	
		try {
			Thread.sleep(3000);
			System.out.println("try inside");
		} catch (InterruptedException ie) {
			
		System.out.println("exception caught");
		ie.printStackTrace();
	}
System.out.println("main ended");
}
}
