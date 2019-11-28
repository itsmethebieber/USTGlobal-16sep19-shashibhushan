package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101,"ankitha",45.55);
		Student s2 = new Student(101,"ankitha",45.55);
		Student s3 = new Student(101,"ankitha",45.55);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i = 0;i<al.size();i++){
			Student s = al.get(i);
		System.out.println("id is "+s.id);
		System.out.println("name is "+s.name);
		System.out.println("% is"+s.percentage);
		}
		
		
		
	}

}
