package com.ustglobal.hashset;

import java.util.Comparator;

public class SortBysal implements Comparator<Customer>{
public int compare(Customer o1,Customer o2) {
		
		Integer i = o1.salary;
		Integer j = o2.salary;
		return i.compareTo(j);
		
	}

}
