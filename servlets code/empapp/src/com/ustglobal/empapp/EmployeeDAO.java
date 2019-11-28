package com.ustglobal.empapp;

import java.util.List;

import com.ustglobal.empappDTO.EmployeeBean;

public interface EmployeeDAO {
	public List<EmployeeBean> getAllEmployeeData();
	public EmployeeBean searchEmployeeDat(int id);
	
	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int insertEmployeeData(int id);
	

}
