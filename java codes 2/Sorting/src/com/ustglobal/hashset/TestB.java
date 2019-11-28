package com.ustglobal.hashset;

import java.util.HashSet;
import java.util.Iterator;



public class TestB {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("vijay");
		hs.add("ajay");
		hs.add("ramesh");
		hs.add("vijay");
		hs.add("suresh");
		System.out.println("------using for each-------");
		for(String s : hs) {
			System.out.println(s);
			
		}
		System.out.println("---------using iterator-------");
		Iterator<String>it = hs.iterator();
		while(it.hasNext()) {
			String p = it.next();
			System.out.println(p);
			
		}
		
	}

}
