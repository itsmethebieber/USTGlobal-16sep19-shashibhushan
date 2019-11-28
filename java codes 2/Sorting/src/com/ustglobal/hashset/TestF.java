package com.ustglobal.hashset;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("ropa");
		ts.add("jaya");
		ts.add("sushma");
		ts.add("munni");
		ts.add("sheela");
		System.out.println("------using for each-------");
		for(String s : ts) {
			System.out.println(s);
			
		}
		System.out.println("---------using iterator-------");
		Iterator<String>it = ts.iterator();
		while(it.hasNext()) {
			String p = it.next();
			System.out.println(p);
			
		}
		
	}
}
		
		
	

