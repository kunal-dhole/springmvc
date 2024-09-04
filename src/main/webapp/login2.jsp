<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="third" method="post">
<%
 out.println(request.getAttribute("msg"));
%>
<input type="text" name="uname">
<input type="password" name="passsword">
<input type="submit" value="submit">


</form>




</body>
</html>