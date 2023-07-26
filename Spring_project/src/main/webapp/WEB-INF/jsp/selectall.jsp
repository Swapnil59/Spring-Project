<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
 <tr>
 <th>id</th>
 <th>first name</th>
 <th>last name</th>
 <th>email</th>
 <th>phone</th>
 <th>city</th>
 <th>state<th>
 <th>address</th>
 </tr>
 <c:forEach var="empData" items="${emplist }">
 
 <tr>
 <td>${empData.id }</td>
 <td>${empData.fname }</td>
 <td>${empData.lname }</td>
 <td>${empData.email }</td>
 <td>${empData.phone }</td>
 <td>${empData.city }</td>
 <td>${empData.state }</td>
 <td>${empData.address}</td>
 </tr>
 
 </c:forEach>
</table>

</body>
</html>