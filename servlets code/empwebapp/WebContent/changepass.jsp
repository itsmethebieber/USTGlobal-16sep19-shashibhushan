<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class = "java.lang.String" scope = "request"></jsp:useBean>
<body>
<a href ="./home">Home</a><a style = "float: right" href ="./logout">Logout</a>
<fieldset>
<legend>change password</legend>
<form action="">
<tr>
<td>new password</td>
<td><input type = "password" name ="password"></td>
</tr>

<tr>
<td>new password</td>
<td><input type = "password" name ="password"></td>
</tr>

<tr>

<td><input type = "reset" name ="reset"></td>
</tr>

</form>
</fieldset>

</body>
</html>