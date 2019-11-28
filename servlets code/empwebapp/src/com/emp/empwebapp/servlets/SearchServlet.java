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
import com.ustglobal.empwebapp.dao.EmpDaoManager;
import com.ustglobal.empwebapp.dao.EmployeeDao;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);

		}else {
			int id = Integer.parseInt(req.getParameter("id"));

			EmployeeDao dao =  EmpDaoManager.getEmployeeDao();
			EmployeeInfo info = dao.searchEmp(id);
			
			req.setAttribute("info", info);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/search.jsp");
			dispatcher.forward(req, resp);
		

//			PrintWriter out = resp.getWriter();
//			out.println("<a href = './home'>Home</a>");
//			out.println("<a style='float:right' href ='./logout'>Logout<a>");
//
//			if(info!=null) {
//				out.println("<table align ='center' border='1px'>");
//				out.println("<tr>");
//
//				out.println("<th>Id</th><th>name</th><th>email</th>");
//
//				out.println("</tr>");
//				out.println("<tr>");
//				out.println("<td>");
//				out.println(info.getId());
//				out.println("</td>");
//				out.println("<td>");
//				out.println(info.getName());
//				out.println("</td>");
//				out.println("<td>");
//				out.println(info.getEmail());
//				out.println("</td>");
//				out.println("</table");
//			}else {
//				out.println("<h1>no data found</h1>");
//			}
//			out.println("</body>");
//			out.println("</html>");

		}
	}

}