package com.ustglobal.comprator;

import java.util.Collections;
import java.util.LinkedList;

public class TestE {
public static void main(String[] args) {
	Marker p1 = new Marker(12.23,"abc","red");
	Marker p2 = new Marker(22.03,"abc","red");
	Marker p3 = new Marker(66.36,"abc","red");
	Marker p4 = new Marker(89.5,"abc","red");
	
	
	LinkedList<Marker> l = new LinkedList<>();
	l.add(p1);
	l.add(p2);
	l.add(p3);
	l.add(p4);
	
	System.out.println("-----------bfore sorting---------");
	display(l);
	SortBYPrice sb = new SortBYPrice();
	Collections.sort(l,sb);
	display(1);
	
	
}

private static void display(int i) {
	// TODO Auto-generated method stub
	
}

static void display(LinkedList<Marker> p) {
	// TODO Auto-generated method stub
	
}


}
