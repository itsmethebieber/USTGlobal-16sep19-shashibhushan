package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.di.Hello;
import com.ustglobal.di.Pet;
import com.ustglobal.springcore.config.ComponentScanConfiguration;

public class AnnotationComponentScanApp {
	public static void main(String[] args) {




		AnnotationConfigApplicationContext c =  
				new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);


		Hello h = c.getBean(Hello.class);
		h.setMsg("moana");
		System.out.println(h.getMsg());


		Pet p = c.getBean(Pet.class);
		p.setName("siri");
		System.out.println(p.getName());
		p.getAnimal().eat();


	}
}
