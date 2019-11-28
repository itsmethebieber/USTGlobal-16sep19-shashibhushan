package com.ustglobal.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<>();
		Employee e1 = new Employee(12,"sweety",22000);
		Employee e2 = new Employee(36,"teju",24000);
		Employee e3 = new Employee(5,"giri",15000);
		Employee e4 = new Employee(25,"sheela",12000);
		Employee e5 = new Employee(25,"sheela",12000);
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		System.out.println("********using iterator******");
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("==================================");
			System.out.println("Id is "+e.id);
			System.out.println("name is "+e.name);
			System.out.println("salary is "+e.salary);
		}
	}

}
