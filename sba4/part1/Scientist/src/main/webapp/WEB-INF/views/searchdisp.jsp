<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/style1.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<c:choose>
<c:when test="${stt==null}"><h1>No Records found!!!</h1></c:when>
<c:otherwise>
<table>
<tr><td>Scientist Name</td><td>Scientist Id</td></tr>
<tr><td><c:out value="${stt.getSname()}"/></td>
<td><c:out value="${stt.getSid()}"/></td>
</tr>
</table>
</c:otherwise>
</c:choose>
</center>
</body>
</html>