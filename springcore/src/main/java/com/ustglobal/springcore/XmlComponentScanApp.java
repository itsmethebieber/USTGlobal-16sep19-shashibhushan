package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.di.Hello;
import com.ustglobal.di.Pet;

public class XmlComponentScanApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c =  new ClassPathXmlApplicationContext("spring.xml");
		
		
		Hello h = c.getBean(Hello.class);
		h.setMsg("moana");
		System.out.println(h.getMsg());
		
		
		Pet p = c.getBean(Pet.class);
		p.setName("siri");
		System.out.println(p.getName());
		p.getAnimal().eat();
		
	}

}
