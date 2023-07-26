<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Wel-come to spring mvc</h1>

<h4 style="color:green">${successMsg }</h4>
<h4 style="color:red">${errMsg }</h4>
<form action="update" method="post">
<input type="text"name="id"placeholder="enter id here">
<input type="text" name="fname" placeholder="enter fname here">
<input type="text" name="lname" placeholder="enter lname here">
<input type="text" name="email" placeholder="enter email here">
<input type="text" name="phone" placeholder="enter phone here">
<input type="text" name="city" placeholder="enter city here">
<input type="text" name="state" placeholder="enter state here">
<input type="text" name="address" placeholder="enter address">
<input type="submit" value="update">
</form>
</body>
</html>