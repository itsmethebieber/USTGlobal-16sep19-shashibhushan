package com.ustglobal.hashset;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq =new PriorityQueue<>();
		pq.add(86);
		pq.add(47);
		pq.add(76);
		pq.offer(1);
		System.out.println("*******using iterator*********");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext())
		{
		Integer c = it.next();
		System.out.println("name is "+c);
		System.out.println("pincode is "+c);
		System.out.println("micr is "+c);
		
				
	}
		
	}
	

}
