package com.ustglbal.collectionframework.methods;

import java.util.ArrayList;
import java.util.Collections;

public class TestC {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("selena");
		al.add("joey");
		al.add("moana");
		al.add("kiran");
		System.out.println("before sort---> "+al);
		Collections.sort(al);
		System.out.println("after sort "+al);
		
	}
}
