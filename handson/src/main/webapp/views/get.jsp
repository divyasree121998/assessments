<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="/css/style.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr> <th> Username </th> <th> Password </th></tr>
<c:forEach items="${myUsers}" var="myUsers">
<tr>
<td> ${myUsers.Username}</td>
<td> ${myUsers.password} </td>
</tr>
</c:forEach>
</table>
</body>
</html>