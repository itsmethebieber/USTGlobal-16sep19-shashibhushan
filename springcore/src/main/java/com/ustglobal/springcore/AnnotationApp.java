package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.di.Animal;
import com.ustglobal.di.Hello;
import com.ustglobal.di.Pet;
import com.ustglobal.springcore.config.HelloConfigurationClass;

public class AnnotationApp {
	public static void main(String[] args) {
		
	
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(HelloConfigurationClass.class);
	
	 Hello h =c.getBean(Hello.class);
	 System.out.println(h.getMsg());
	 
	 Hello h1 =c.getBean(Hello.class);
	 System.out.println(h);
	 System.out.println(h1);
	 System.out.println("**************");
	 
	 
	// Animal a = c.getBean(Animal.class);
	// a.eat();
	 
	 System.out.println("************************************");
	 
	 Pet p = c.getBean(Pet.class);
	 System.out.println(p.getName());
	 p.getAnimal().eat();
	 c.close();// have to remove prototype to execute destroy
	 

	}

}
