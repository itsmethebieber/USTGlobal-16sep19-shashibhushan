package com.ustlobal.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
	public static void main(String[] args) {
		
		
		try(FileReader in = new FileReader("CSv.txt");
				BufferedReader reader = new BufferedReader(in)){
			while(reader.ready())
			{
				String line = reader.readLine();
				String[] words = line.split(",");
				System.out.println("id = ");
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
