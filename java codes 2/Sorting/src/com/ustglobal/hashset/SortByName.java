package com.ustglobal.hashset;

import java.util.Comparator;

import com.ustglobal.comprator.Marker;

public class SortByName implements Comparator<Bank>{

	public int compare(Bank o1,Bank o2) {
		return o1.name.compareTo(o2.name);


	}
}
