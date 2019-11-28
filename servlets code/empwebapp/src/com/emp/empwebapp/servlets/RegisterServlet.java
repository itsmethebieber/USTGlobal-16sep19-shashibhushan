package com.emp.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.dao.EmpDaoManager;
import com.ustglobal.empwebapp.dao.EmployeeDao;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id = Integer.parseInt(req.getParameter("id"));
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String password = req.getParameter("password");
	
	EmployeeInfo info = new EmployeeInfo();
	info.setId(id);
	info.setName(name);
	info.setEmail(email);
	info.setPassword(password);
	
	
	
	EmployeeDao dao = EmpDaoManager.getEmployeeDao();
	boolean check = dao.registerEmp(info);
	PrintWriter out = resp.getWriter();
	String msg = "";
	
	
	
	if(check) {
		msg = "Registration Completed";
		
		
	}else {
		msg = "Id cannot be repeated";
		
	}
	req.setAttribute("msg", msg);
	RequestDispatcher disp =req.getRequestDispatcher("/login.jsp");
	disp.forward(req,resp);

	
	}

}
