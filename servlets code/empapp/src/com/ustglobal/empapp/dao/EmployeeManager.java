package com.ustglobal.empapp.dao;

public class EmployeeManager {

	private EmployeeManager() {
		
	}
	public static EmployeeDAOImpl getEmployeeDAO() {
		return new EmployeeDAOImpl();
		
	}

}
