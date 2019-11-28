package com.ustglobal.exception.second;

import java.io.IOException;
import java.sql.SQLException;

public class TestB {
	public static void main(String[] args) {
		System.out.println("main started");
		FileTest ft = new FileTest();
		
			
					try {
						ft.open();
					} catch (ClassNotFoundException | IOException | SQLException e) {
						
						e.printStackTrace();
					}
	}
}
			





