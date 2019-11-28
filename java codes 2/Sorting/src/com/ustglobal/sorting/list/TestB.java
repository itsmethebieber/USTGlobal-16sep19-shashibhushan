package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		LinkedList<Laptop>li = new LinkedList<>();
		
		Laptop lp1 = new Laptop(6,"hp",1200);
		Laptop lp2 = new Laptop(3,"dell",6000);
		Laptop lp3 = new Laptop(2,"mac",4000);
		Laptop lp4 = new Laptop(5,"asus",800000);
		
		
		
		li.add(lp1);
		li.add(lp2);
		li.add(lp3);
		li.add(lp4);
		li.add(new Laptop(20,"acer",200000));
		System.out.println("before Sorting");
		displayLaptopDetails(li);
		Collections.sort(li);
		
		System.out.println("after sorting---------------------");
		displayLaptopDetails(li);
	
		
		
		
	}

	public static void displayLaptopDetails(LinkedList<Laptop> l) {
		// TODO Auto-generated method stub
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("brand is "+lp.name);
			System.out.println("price is "+lp.price);
			System.out.println("ram is "+lp.ram);
		}
	}
	

}
