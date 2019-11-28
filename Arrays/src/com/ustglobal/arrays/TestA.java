package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int [] arr = new int[5];
		System.out.println(arr.length);
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

		System.out.println("for each");
		for(int i:arr)
			System.out.println(i);
		
		System.out.println("for each");
		int arr1[] = {10,20,30,40,};
		for(int i:arr1)
			System.out.println(i);
		
		System.out.println("character array");
		char c[] = {'a','b','c','d'};
		for(char a:c)
			System.out.println(a);
		
		System.out.println("boolean array");
		boolean[] b = {true,false,true,false,true,true};
		
		System.out.println("string array");
		String[] names = {"shashi","hari","varun","goutham"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
			
		}

	}
}
