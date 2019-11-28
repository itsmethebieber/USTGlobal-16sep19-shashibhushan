package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class ExecuteInsertQuery {
	
	public static void main(String[] args) {
		Connection conn = null;
		//java.sql.Statement stmt = null;
		PreparedStatement pstmt = null;

		try {// load the drivers
			
			Driver driver = new Driver();
			DriverManager.deregisterDriver(driver);
			// step 2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?";
			conn = DriverManager.getConnection(url,"root","root");
			
			// step 3 issue SQL query
			String SQL =  " insert into emp_info values(?,?,?,?) ";
			//stmt= conn.createStatement();
			 pstmt = conn.prepareStatement(SQL);
			 String empid = args[0];
			 int id = Integer.parseInt(empid);
			 pstmt.setInt(1,id);
		
			
			// step 4 read the result
			System.out.println(" Row(S) inserted");
		} 
		catch (SQLException e)
		{
		
		} finally {
			try {
				
				if(conn!=null)
				{
					conn.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		
		
			
		}
	}

}
