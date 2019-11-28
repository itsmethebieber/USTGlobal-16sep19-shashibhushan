package com.ustgloal.typecasting.reference;

public class TestC {
public static void main(String[] args) {
	Pen a = new Pen();
	System.out.println(a.cost);
	a.write();
	Marker m = (Marker) a;
	
	m.color();
	 
}
}