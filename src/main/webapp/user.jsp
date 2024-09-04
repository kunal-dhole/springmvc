<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.println(request.getAttribute("msg"));
%>


<form action="UserLoginServlet" method="post">
<table align='center'>

<tr>
<td><input type="text" name="uname"></td>
</tr>

<tr>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td><input type="submit" value="submit"></td>
</tr>

</table>

</form>
</body>
</html>