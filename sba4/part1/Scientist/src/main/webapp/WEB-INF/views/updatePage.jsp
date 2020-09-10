<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
<title>Update</title>
<link href="<c:url value="/resources/style1.css" />" rel="stylesheet">
</head>
<body>
<h1>
Scientist details Can be Updated Here!!!
</h1>
<center>
<form action="searchforUpdate">
Scientist Id:<input type="text" name="sid" value="${scientist.sid}">
<input type="submit" value="search">
</form>


<form action="updatedata">
Scientist Name:<input type="text" name="sname" value="${scientist.sname}">
<br>

<input type="submit" value="update scientist">
</form>
</center>
</body>
</html>