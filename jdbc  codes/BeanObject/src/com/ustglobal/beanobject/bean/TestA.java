package com.ustglobal.beanobject.bean;

public class TestA {
public static void main(String[] args) {
	Student s = new Student();
	s.setId(12);
	s.setName("shivagami");
	s.setRollno(134);
	
	Database db = new Database();
	db.recieve(s);
	
	Employee e = new Employee();
	s.setId(12);
	s.setName("shivagami");
	
	
	
	
}
}
