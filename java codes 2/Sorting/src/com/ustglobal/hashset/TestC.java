package com.ustglobal.hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet<>();
		ls.add("nikitha");
		ls.add(44);
		ls.add(555);
		ls.add("nika");
		
	    
		
		System.out.println("------using for each-------");
		for(Object s : ls) {
			System.out.println(s);
			
		}
		System.out.println("---------using iterator-------");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
			
		}
		
	}

}
