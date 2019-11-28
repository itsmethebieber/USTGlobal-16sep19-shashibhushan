package com.ustglobal.assignment;

import java.sql.*;
public class StaticInsertQuery {
	
	
	private static final String url = "jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=root";
	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private static final String Insert_Query = "insert into employee_info "+" values(1,'bhushan','shashijb04@gmail.com','1234')";
	
	public static void main(String[] args) {
	
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection con = DriverManager.getConnection(url)){
				try(Statement stm = con.createStatement()){
								
					int count = stm.executeUpdate(Insert_Query);	
					System.out.println(count+"rows are affected");
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
