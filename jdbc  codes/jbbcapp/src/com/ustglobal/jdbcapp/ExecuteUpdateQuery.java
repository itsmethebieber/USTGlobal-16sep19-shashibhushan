package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class ExecuteUpdateQuery {
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.deregisterDriver(driver);
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?";
			con = DriverManager.getConnection(url,"root","root");
			
			String sql = "update emp_info set name ='elena',sal = 1000, gender = 'f' where id =7 ";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(sql);
			System.out.println(count+"rows affected");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(con !=null) {
						con.close();
					}
					if(stmt!=null) {
						stmt.close();
					}
				
			}catch (SQLException e){
			
			
			e.printStackTrace();
		}
		
	}

}
}
