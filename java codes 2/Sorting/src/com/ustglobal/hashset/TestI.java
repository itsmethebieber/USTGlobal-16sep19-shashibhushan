package com.ustglobal.hashset;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		SortByName sb = new SortByName();
		SortBypin pi = new SortBypin();
		
		
		TreeSet<Bank> ts = new TreeSet<>(pi);
		Bank b1 = new Bank("HDFC",56068,67686869);
		Bank b2 = new Bank("Paytm",6989235,98956145);
		Bank b3 = new Bank("SBI",3645,548464648);
		Bank b4 = new Bank("KOTAK",68,3652896);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		System.out.println("*******using iterator*********");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext())
		{
		Bank b = it.next();
		System.out.println("name is "+b.name);
		System.out.println("pincode is "+b.pincode);
		System.out.println("micr is "+b.micr);
		
				
	}
}
}
