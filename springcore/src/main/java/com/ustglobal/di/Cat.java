package com.ustglobal.di;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat  implements Animal{
	
	public void eat() {
		System.out.println("lick lick");
	}
	

}
