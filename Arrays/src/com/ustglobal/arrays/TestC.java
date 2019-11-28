package com.ustglobal.arrays;

public class TestC {
	public static void main(String[] args) {

		Student s = new Student(1,"shashi", 69.9);
		Student s1 = new Student(2,"hari", 78.6);
		Student s2 = new Student(1,"lizol", 99.9);
		Student[] students = new Student[3];

		students[0] = s;
		students[1] =s1;
		students[2] =s2;

		
		for(Student s3 : students) {
			System.out.println(s1);
		}
		recieve(students);
	}
	static void recieve(Student[] stu) {
		for(Student s: stu) {
			System.out.println(s);
		}
	}
}
