package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

import com.ustglobal.di.Cat;
import com.ustglobal.di.Panda;
import com.ustglobal.di.Pet;

public class PetConfigurationClass {
	@Bean(name = "panda")      
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
