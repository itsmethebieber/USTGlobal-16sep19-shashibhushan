package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(152);
		l.add(214);
		l.add(184);
		l.add(847);
		System.out.println("--------------");
		Integer pollElement = l.poll();
		System.out.println("poll element "+pollElement);
		Integer pollFirstElement = l.pollFirst();
		
		
	}

}
