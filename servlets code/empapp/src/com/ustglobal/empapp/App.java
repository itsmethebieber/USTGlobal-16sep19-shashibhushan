package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dao.EmployeeManager;
import com.ustglobal.empappDTO.EmployeeBean;

public class App {
	public static void main(String[] args) {
		System.out.println("press 1 to get all employee data");
		System.out.println("press 2 to insert  employee data");
		System.out.println("press 3 to update employee data");
		System.out.println("press 4 to delete employee data");
		System.out.println("press 5 to search single employee");

		Scanner scn = new Scanner(System.in);
		int ch  = scn.nextInt();

		switch(ch) {
		case 1:
			EmployeeDAO impl =  EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result =impl .getAllEmployeeData();			
			for(EmployeeBean b : result) {
				System.out.println("name: "+b.getName());
				System.out.println("Id: "+b.getId());
				System.out.println("sal: "+b.getSal());
				System.out.println("gender: "+b.getGender());

			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4: 
			break;


		case 5:
			EmployeeDAOImpl impl5 = new EmployeeDAOImpl();
			int id = scn.nextInt();
			EmployeeBean b=impl5.searchEmployeeData(id);
			if(b!= null)
			{
				System.out.println("=======searching data is=====");
				System.out.println(b.getName());
				System.out.println(b.getId());
				System.out.println(b.getGender());
				System.out.println(b.getSal());

			}
			break;

		}


	}
}

