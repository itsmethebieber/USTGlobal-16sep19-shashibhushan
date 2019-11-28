package com.ustglbal.collectionframework.methods;

import java.util.Collections;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(123);
		l.add(1);
		l.add(185);
		l.add(165);
		l.add(63);
		System.out.println("before sort "+l);
		Collections.sort(l);
		System.out.println("after sort "+l);
		Collections.reverse(l);
		System.out.println("after reverse "+l);
		Collections.shuffle(l);
		System.out.println("after shuffle "+l);
		
	}

}
