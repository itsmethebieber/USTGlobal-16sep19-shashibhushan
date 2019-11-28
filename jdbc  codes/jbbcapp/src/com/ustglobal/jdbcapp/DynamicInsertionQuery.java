package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class DynamicInsertionQuery {

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

			String name = args[1];
			pstmt.setString(2, name);;

			String sal =args[3];
			int salary = Integer.parseInt(sal);
			pstmt.setInt(3, salary);
			
			String gen = args[3];
			pstmt.setString(4,gen);


			// step 4 read the result
			System.out.println(" Row(S) inserted");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();

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
