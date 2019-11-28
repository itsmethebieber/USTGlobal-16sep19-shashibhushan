package com.ustglobal.assignment;

import java.sql.*;

public class InsertQuery {
	
	private static final String url = "jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=root";
	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private static final String INSERT_SQL = "insert into employee_info values(?,?,?,?)";
	
	public static void main(String[] args) {
		
		
		try {
				Class.forName(DRIVER_CLASS_NAME);
		        try (Connection con = DriverManager.getConnection(url))
		    	 {
		    	   		
		    	   		int id  =Integer.parseInt(args[0]);
		    	   		String name = args[1];
		    	   		String email = args[2];
		    	   		String password = args[3];
		    	   		
		    	   		try(PreparedStatement pstm = con.prepareStatement(INSERT_SQL))
		    	   		{
		    	   	    	pstm.setInt(1,id);
		    	   		    pstm.setString(2,name);
		    	   		    pstm.setString(3,email);
		    	   		    pstm.setString(4,password);
		    
		    	   		    int count = pstm.executeUpdate();
		    	   		    System.out.println(count+"rows are affected");
		               }
		       }
		}
		catch(Exception e) {
			e.printStackTrace();
	}
  }
}
