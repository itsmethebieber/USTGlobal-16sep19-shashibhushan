package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class DeleteQuery {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
	}
	

}
