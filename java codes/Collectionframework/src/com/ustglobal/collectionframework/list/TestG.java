package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(12);
		li.add(34.5);
		li.add("more");
		li.add(true);
		li.add(null);
		System.out.println("===========using for loop======================");
		for(int i = 0;i<li.size(); i++) {
			System.out.println(li.get(i));
			
		}
		System.out.println("================using iterator==========");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		System.out.println("==================listierator==========");
		ListIterator il= li.listIterator();
		while(il.hasNext()) {
		Object o = il.next();
		System.out.println(o);
		
		
	}
		System.out.println("previous==========");
		

}
	
	}

