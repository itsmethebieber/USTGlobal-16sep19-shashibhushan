package com.ustglobal.hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<Double> ls = new LinkedHashSet<>();
		ls.add(45.2);
		ls.add(44.2);
		ls.add(55.5);
		ls.add(22.6);
		
	    
		
		System.out.println("------using for each-------");
		for(Double d : ls) {
			System.out.println(d);
			
		}
		
		
	}

}
