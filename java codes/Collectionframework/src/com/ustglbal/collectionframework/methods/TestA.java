package com.ustglbal.collectionframework.methods;

import java.util.ArrayList;
import java.util.List;

public class TestA {
public static void main(String[] args) {
	ArrayList<Double> a1 = new ArrayList<Double>();
	a1.add(34.5);
	a1.add(85.2);
	a1.add(96.0);
	a1.add(78.2);
	a1.add(64.3);
	a1.add(null);
	a1.add(null);
	System.out.println(a1);
	a1.add(2,65.3);
	System.out.println("after adding 2nd index "+a1);
	a1.remove(0);
	System.out.println("after removing "+a1);
	a1.remove(null);
	System.out.println("after removunf=g nul "+a1);
	Double val = a1.get(4);
	System.out.println("object at 4th index "+val);
	a1.set(2, 77.6);
	System.out.println("After replacing 2nd index "+a1);
	a1.clear();
	System.out.println("after clear method "+a1);
	a1.contains(54.2);
	List<Double> al1 = new ArrayList<>();
	al1.add(13.5);	
	al1.add(63.2);
	al1.add(65.2);
	al1.addAll(al1);
	System.out.println("after add all "+a1);
	boolean contains = a1.containsAll(al1);
	System.out.println("contins all of al1 "+contains);
	
	
}
}
