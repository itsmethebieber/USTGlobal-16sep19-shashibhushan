package com.ustglobal.empwebapp.dao;

import com.emp.empwebapp.dto.EmployeeInfo;

public interface EmployeeDao {
	public EmployeeInfo auth(int id, String password);
	public EmployeeInfo searchEmp(int id);
	public boolean changePassword(int id, String password);
	public boolean registerEmp(EmployeeInfo info);

}
