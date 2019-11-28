package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(23);
		arr.add(23.989);
		arr.add(true);
		arr.add("Good Evening");
		
		Iterator it = arr.iterator();
		Object o1 = it.next();
		System.out.println("obj1 "+o1);
		
		Object o2 = it.next();
		System.out.println("obj2 "+o2);
		
		Object o3 = it.next();
		System.out.println("obj5 "+o3);
		
		Object o4 = it.next();
		System.out.println("obj4 "+o4);
		boolean b = it.hasNext();
		
		//Object o5 = it.next();
		//System.out.println("obj5 "+o5);
		
		for(int i=0;i<arr.size();i++) {
			Object o = arr.get(i);
			System.out.println(o);
		}
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(69151.5);
		al.add("mpml");
		al.add(false);
		
		System.out.println("====using iterator====");
		Iterator t = al.iterator();
		while(t.hasNext()) {
			Object o = t.next();
			System.out.println(o);
			
		}
		System.out.println("++++for loop++++");
		
		
		
	}		
	
}
