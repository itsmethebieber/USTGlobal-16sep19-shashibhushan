package com.ustglobal.exception.customizeduncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("main started");
		Validator v = new Validator();
		try {
		v.verify(10);
		}catch(InvalidAgeException ie) {
			System.out.println("exception occured");
		}
		v.verify(13);
		System.out.println("main ended");

	}

}
