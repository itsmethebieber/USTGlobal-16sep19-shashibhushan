package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

public class TestServlet extends HttpServlet { 

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String search = req.getParameter("search");
	
	int num = Integer.parseInt(search);
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		// step 1 load the connection
		Driver d = new Driver();
		DriverManager.deregisterDriver(d);
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
		String sql  = "select * from emp_info where id = ?" ;
		
		
		conn = DriverManager.getConnection(url);
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, num);
		
		rs = pstmt.executeQuery();
		
		// step 4 : read the result
		if(rs.next()) {
			int emp_id =rs.getInt("id");
			int sal=rs.getInt("sal");
			String name = rs.getString("name");
			String gender = rs.getString("gender");
			
			PrintWriter out = resp.getWriter();
			
			out.println("id : "+emp_id);
			
			out.println("name : "+name);
			out.println("gender : "+gender);
		}else {
			System.out.println("no data found");
		}
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	
	}finally {
		try {
			
			if(conn!=null)
			{
				conn.close();
			}
			if(pstmt!=null)
			{
				pstmt.close();
			}
			if(rs !=null)
			{
				rs.close();
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
}
}
}
