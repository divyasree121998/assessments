<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Display Details</title>

</head>
<body>
<center>
<table border="5">
<tr><td>Scientist Name</td><td>Scientist Id</td></tr>
<c:forEach items="${sci}" var="sc">
<tr><td><c:out value="${sc.getSname()}"/></td>
<td><c:out value="${sc.getSid()}"/></td>
<br>
</c:forEach>
</table>
</center>
</body>
</html>