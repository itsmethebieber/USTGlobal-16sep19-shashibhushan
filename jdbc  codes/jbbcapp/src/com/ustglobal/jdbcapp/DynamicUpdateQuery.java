package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Driver d = new Driver();
			DriverManager.deregisterDriver(d);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
			
			conn = DriverManager.getConnection(url);
			String sql = "update emp_info set name = ?,salary= ?,gender = ? where id =?";
			
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1,id);

			String name = args[1];
			pstmt.setString(2, name);;

			String sal =args[2];
			int salary = Integer.parseInt(sal);
			pstmt.setInt(3, salary);
			
			String gen = args[3];
			pstmt.setString(4, gen);
			
			
			pstmt.setInt(4,id);
			pstmt.setString(1,name);
			pstmt.setInt(2,salary);
			pstmt.setString(3,gen);
			
			int count = pstmt.executeUpdate();
			System.out.println(count+"rows affected");
			
		} 
		catch (SQLException e) {
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
				if(rs !=null) {
					rs.close();
				}

			}catch (SQLException e) {
				e.printStackTrace();
			}



		}
	}

}
