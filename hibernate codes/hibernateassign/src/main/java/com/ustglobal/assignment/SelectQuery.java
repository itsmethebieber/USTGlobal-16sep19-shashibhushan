package com.ustglobal.assignment;

import java.sql.*;
public class SelectQuery {
	 
	         private static final String url = "jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=root";
	         private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	         private static final String SELECT_SQL = "select * from employee_info where id=?";
	         
			public static void main(String[] args) {
				
			try {
					Class.forName(DRIVER_CLASS_NAME);
					
					try(Connection con = DriverManager.getConnection(url)){
						
						try(PreparedStatement pstm = con.prepareStatement(SELECT_SQL)){
							
							int id = Integer.parseInt(args[0]);
							pstm.setInt(1,id);
							
							try(ResultSet rs = pstm.executeQuery()){
								
								while(rs.next()) {
								
									System.out.println("Id = "+rs.getInt("id"));
									System.out.println("Name = "+rs.getString("name"));
									System.out.println("email = "+rs.getString("email"));
									System.out.println("password = "+rs.getString("password"));
								}
							}
						}
					}		
				}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
}
