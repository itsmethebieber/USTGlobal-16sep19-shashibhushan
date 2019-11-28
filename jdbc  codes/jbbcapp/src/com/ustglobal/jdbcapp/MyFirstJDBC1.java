package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC1 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {// step 1: load the driver
			Driver driver = new Driver();
			//step 2: the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?"; //+"user=root&password=root";
			conn = DriverManager.getConnection(url,"root","root");
			stmt = conn.createStatement();
			//step:3 -- issue SQL query
			String sql = "select * from emp_info";
			rs = stmt.executeQuery(sql);


			//step 4: 
			while(rs.next()) {
				int id = rs.getInt("id");
				String name =rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");

				System.out.println("id is "+id);
				System.out.println("name is "+name);
				System.out.println("salary is "+sal);
				System.out.println("gender: "+gender);
				System.out.println("*****************************113113333333333333333333333***********");

			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally  {
			//close all jdbc objects
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs !=null) {
					rs.close();
				}
			}catch(SQLException e ) {
				e.printStackTrace();
			}

		}

	}
}
