package com.ustglobal.Lambdaexpressions;

public class TestAdd implements AddInterface{
	public static void main(String[] args) {
		TestAdd t = new TestAdd();
		int sum = t.add(12,13);
		System.out.println("sum is "+sum);
		
	}

	@Override
	public int add(int a, int b) {
		
		return a * b;
	}
	

}
