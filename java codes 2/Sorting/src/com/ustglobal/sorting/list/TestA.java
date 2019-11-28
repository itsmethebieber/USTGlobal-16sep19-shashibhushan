package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<>();
		Student s1 = new Student(15,"shashi",35.4);
		Student s2 = new Student(52,"moana",69.2);
		Student s3 = new Student(15,"david",49.2);
		Student s4 = new Student(15,"ken adams",89.4);
	
	s.add(s1);
	s.add(s2);
	s.add(s3);
	s.add(s4);
	System.out.println("Before sorting-------");
	displayStudentDetails(s);
	Collections.sort(s);
	
	}
	 static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s1 = it.next();
			System.out.println("Id is "+s1.id);
			System.out.println("name is "+s1.name);
			System.out.println("percentage  is "+s1.percentage);
			
		}
				
	}
}
