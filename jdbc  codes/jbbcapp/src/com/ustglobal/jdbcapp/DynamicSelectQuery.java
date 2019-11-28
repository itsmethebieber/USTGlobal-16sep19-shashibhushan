package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
		String sql = "select * from emp_info where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// step 1 load the connection
			Driver d = new Driver();
			DriverManager.deregisterDriver(d);
			
			//step2 : get the connection
			conn = DriverManager.getConnection(url);
			
			//step3 : issue sql query
			pstmt = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			// step 4 : read the result
			if(rs.next()) {
				int emp_id =rs.getInt("id");
				int sal=rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("id : "+emp_id);
				System.out.println("sal : "+sal);
				System.out.println("name : "+name);
				System.out.println("gender : "+gender);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		}
	}

}
