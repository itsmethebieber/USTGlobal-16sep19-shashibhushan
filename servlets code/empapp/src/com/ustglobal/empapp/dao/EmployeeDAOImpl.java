package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.ustglobal.empapp.EmployeeDAO;
import com.ustglobal.empappDTO.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO{

	public ArrayList<EmployeeBean> getAllEmployeeData() {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from emp_info";
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			String result ="";
			ArrayList<EmployeeBean> a1= new ArrayList<EmployeeBean>();

			while(rs.next()) {
				EmployeeBean b = new EmployeeBean();
				int id = rs.getInt("id");
				b.setId(id);
				String name = rs.getString("name");
				b.setName(name);
				int sal = rs.getInt("sal");
				b.setSal(sal);
				a1.add(b);
				



			}
			return a1;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!= null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();

				}
				if(rs!= null) {
					rs.close();
				}



			}
			catch(Exception e ) {
				e.printStackTrace();




			}
		}

	}

	public EmployeeBean searchEmployeeData(int id) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from emp_info where id = ?";

		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url);
				
				pstmt = (PreparedStatement) conn.prepareStatement(sql);
				pstmt.setInt(1, id);
				rs = pstmt.executeQuery();
				if(rs.next())
				{
					EmployeeBean bean = new EmployeeBean();
					bean.setId(rs.getInt("id"));
					
							bean.setName(rs.getString("Name"));
							bean.setSal(rs.getInt("sal"));
							bean.setGender(rs.getString("gender"));
							return bean;
							
							
							
							
				}
				else {
					return null;
				}
				
				
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!= null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();

				}
				if(rs!= null) {
					rs.close();
				}



			}
			catch(Exception e ) {
				e.printStackTrace();




			}
		}

	}

	@Override
	public EmployeeBean searchEmployeeDat(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployeeData(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertEmployeeData(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

		

		

		}
	
	









