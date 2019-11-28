package com.ustglobal.hashset;

import java.util.Comparator;

import com.ustglobal.comprator.Marker;

public class SortBypin implements Comparator<Bank> {

	public int compare(Bank o1,Bank o2) {
		
		Integer i = o1.pincode;
		Integer j = o2.pincode;
		return i.compareTo(j);
		
	}

}
