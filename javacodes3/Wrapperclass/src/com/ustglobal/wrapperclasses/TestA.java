package com.ustglobal.wrapperclasses;

public class TestA {

	public class TestB {

	}
	public static void main(String[] args) {
		int a =10;
		System.out.println("a is "+a);
		Integer i = a; // boxing or auto boxing
		System.out.println("i is "+i);

		Integer x = 10;

		System.out.println("x is "+x);
		Integer y = x;// unboxing or  auto unboxing
		System.out.println("y is "+y);
		int value = Integer.parseInt("123");
		System.out.println("value is "+value);
		boolean result1 =Boolean.parseBoolean("123true");
		System.out.println("value is "+value);

	}
}

