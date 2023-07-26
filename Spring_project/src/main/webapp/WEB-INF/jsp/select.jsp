<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4 style="color:green">${successMsg }</h4>
<h4 style="color:red">${errMsg }</h4>
<form action="select"method="post">
<input type="text" name="id" placeholder="enter id here">
<input type="submit" value="click">
</form>
</body>
</html>