package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {
		String s1 = "shashi";
		String s2 = "hari";
		String s3 = new String("shashi");
		String s4 = new String("shashi");
		String s5 = "shashi";
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1==s5);

		String s6 =s1.toLowerCase();
		System.out.println(s6);
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		char c = s1.charAt(1);
		System.out.println(c);
		boolean b = s1.equalsIgnoreCase("shASHI");
		System.out.println(b);
		System.out.println("=============");
		
		StringBuffer sb1 = new StringBuffer("kavya");
		sb1.append("karthi");

		System.out.println(sb1);

	}
}
