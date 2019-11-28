<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="info" class ="com.emp.empwebapp.dto.EmployeeInfo"
    scope='session'></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a style = "float : right;" href='./Logout.html'>search</a>"
<h1>Welcome<%=info.getName() %></h1>
<a href='./search.html'>Search</a>
<a href='./changepass.jsp'>search</a>
</body>
</html>