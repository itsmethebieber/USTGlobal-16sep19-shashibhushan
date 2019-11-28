package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{
	double price;
	int ram;
	String name;
	public Laptop( int ram, String name, double price) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	public int compareTo(Laptop lp) {
		if(this.price>lp.price) {
			return 1;
		}else if(this.price<lp.price){
			return -1;
		
		}
		return 0;
	
	}
}


