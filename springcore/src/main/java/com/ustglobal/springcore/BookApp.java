package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.di.Book;

public class BookApp {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("NewBeans.xml");
		
		Book b = c.getBean(Book.class);
    	System.out.println(b.getName());
		
		
	}

}
