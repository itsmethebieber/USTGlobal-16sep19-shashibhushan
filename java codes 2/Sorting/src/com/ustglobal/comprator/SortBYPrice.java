package com.ustglobal.comprator;

import java.util.Comparator;

public class SortBYPrice implements Comparator<Marker> {

	
	public int compare(Marker o1,Marker o2) {
		if(o1.price>o2.price)
		{
			return 1;
			
		}
		else if(o1.price<o2.price)
		{
			
		return -1;
		
		}
		else
		return 0;
		
	}
}

