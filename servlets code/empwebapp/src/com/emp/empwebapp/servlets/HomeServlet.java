package com.emp.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.emp.empwebapp.dto.EmployeeInfo;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session !=null) {
			
			RequestDispatcher disp =req.getRequestDispatcher("/home.jsp");
			disp.include(req,resp);


		
		}else {
			RequestDispatcher disp =req.getRequestDispatcher("/login.jsp");
			disp.include(req,resp);

		}

	}
       @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                doGet(req,resp);
    }

}
