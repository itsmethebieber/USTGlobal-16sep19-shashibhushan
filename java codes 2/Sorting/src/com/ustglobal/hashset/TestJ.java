package com.ustglobal.hashset;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		SortBysal sa = new SortBysal();
		TreeSet<Customer> ts = new TreeSet<>(sa);
		
		Customer c1 = new Customer("shashi",1,100000);
		Customer c2 = new Customer("Moana",2,10000);
		Customer c3 = new Customer("mike",3,10000);
		Customer c4 = new Customer("brock",4,1000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		System.out.println("*******using iterator*********");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext())
		{
		Customer c = it.next();
		System.out.println("name is "+c.name);
		System.out.println("pincode is "+c.id);
		System.out.println("micr is "+c.salary);
		
				
	}
		
	}

}
