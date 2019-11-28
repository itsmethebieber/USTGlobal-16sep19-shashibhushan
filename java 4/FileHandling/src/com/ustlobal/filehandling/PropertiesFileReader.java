package com.ustlobal.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		String path = "test.properties";
	
		FileReader reader = null;
		
		try {
			reader = new FileReader(path);
			Properties pro = new Properties();
			pro.load(reader);
			String name = pro.getProperty("name");
			String company = pro.getProperty("company");
			String gf = pro.getProperty("gf");
			
			System.out.println("name is " +name);
			System.out.println("company is "+company);
			System.out.println("gf is "+gf);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
