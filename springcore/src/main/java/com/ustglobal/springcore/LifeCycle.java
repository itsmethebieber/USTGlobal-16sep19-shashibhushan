package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.di.Hello;

public class LifeCycle {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
		Hello h = c.getBean(Hello.class);
		System.out.println(h.getMsg());
		c.close();
	}

}
