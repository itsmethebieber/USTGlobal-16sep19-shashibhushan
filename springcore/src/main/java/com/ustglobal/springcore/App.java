package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.di.Animal;
import com.ustglobal.di.Hello;
import com.ustglobal.di.Human;
import com.ustglobal.di.Pet;

/**
 * I Am Groot!
 *
 */
public class App {

    public static void main( String[] args ) {
    	ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
    	Hello h = c.getBean(Hello.class);
    	System.out.println(h.getMsg());
    	
    	Hello h2 = c.getBean(Hello.class);
    	System.out.println(h);
    	System.out.println(h2);
    	
   
    	
    	Animal a = c.getBean(Animal.class);
    	a.eat();
    	
    	Human hu = c.getBean(Human.class);
    	hu.eat();
    	
    	Animal a2 = (Animal)c.getBean("panda");
    	a2.eat();
    	System.out.println("*************************************************");
    	Pet p = c.getBean(Pet.class);
    	System.out.println(p.getName());
    	p.getAnimal().eat();
    	
    	
    	System.out.println("******************");
    	System.out.println(h.getMap());
    	
    	
    	
    
    			
    
}
}
