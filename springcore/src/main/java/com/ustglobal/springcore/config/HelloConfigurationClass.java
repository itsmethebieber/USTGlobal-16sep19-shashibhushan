
package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.di.Cat;
import com.ustglobal.di.Hello;
import com.ustglobal.di.Panda;
import com.ustglobal.di.Pet;



@Configuration   // by using config class behaves like xml file

public class HelloConfigurationClass {
	
	@Bean(name = "hello")
	//@Scope("prototype")
	public Hello getHello() {
		Hello h = new Hello();
		h.setMsg("jf;ajf;f;");
		return h;
		
	}
	@Bean(name = "panda")      // we implemented animal for this class
	public Panda getPanda() {
		return new Panda();
	}
	
	@Bean(name = "cat")
	public Cat getCat() {
		return new Cat();
	}
	
	
	@Bean(name = "Pet")
	public Pet getPet() {
		
		Pet p = new Pet();
		p.setName("sam");
		p.setAnimal(getPanda());  
		return p;
	}

}
