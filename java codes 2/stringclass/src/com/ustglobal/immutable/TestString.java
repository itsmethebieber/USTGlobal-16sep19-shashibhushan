package com.ustglobal.immutable;

public class TestString {
	public static void main(String[] args) {
		MyString ms = new MyString(12,"megha");
	
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
		
		ms.changeContent(20,"rupa");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		
		System.out.println("===========");
		
		System.out.println(ms.getName());
	}

}
