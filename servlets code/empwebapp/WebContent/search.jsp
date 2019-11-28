<%@page import="com.emp.empwebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
        EmployeeInfo info = (EmployeeInfo)request.getAttribute("info");
%>

<body>
	<a href='./home'>Home</a>
	<a style='float: right' href='./logout'>Logout</a>
	<%if(info!=null){ %>
	<fieldset>
	<legend>EmployeeInfo</legend>
			<table align='center' border='1px'>
				<tr>
					<th>Id</th>
					<th>name</th>
					<th>email</th>
				</tr>
				<tr>
					<td><%=info.getId()%></td>
					<td><%=info.getName()%></td>
					<td><%=info.getEmail() %></td>

				</tr>
			</table>
			</fieldset>
			<%}else { %>
			<h1>Data not found</h1>
			<%} %>
</body>
</html>