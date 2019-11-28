package com.ustglobal.empwebapp.dao;

public class EmpDaoManager {
	private EmpDaoManager() {}
		public static EmployeeDao getEmployeeDao() {
			return new EmpDaoJdbcImpl();
			
		}
	}


