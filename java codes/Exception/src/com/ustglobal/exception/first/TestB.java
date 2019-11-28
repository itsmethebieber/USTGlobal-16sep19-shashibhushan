package com.ustglobal.exception.first;

public class TestB {
	public static void main(String[] args) {
		System.out.println("main started");
		int b=0;
		try {
			b=10/0;
			System.out.println(b);
			System.out.println("its not gng to execute anyway");
			System.out.println();

		}catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
		}

		System.out.println("main ended");

	}
}
