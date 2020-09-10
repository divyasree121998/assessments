<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>
<h1>
<center>Welcome to scientists world!!!</center>
</h1>
<center>
<div>
<form action="save">
Scientist Name:<label><input type="text" name="sname"></label><br><br>
Scientist Id:<lablel><input type="text" name="sid"></label><br><br>

<input type="submit">
</form>
</div>
<br>
<form action="updatePage">
Update the existing data<input type="submit" value="update">
</form>
<form action="delete">
Delete the existing data:<input type="text" name="sname">
<input type="submit" value="delete">
</form>
<form action="Search">
<input type="submit" value="Search">
</form>

</center>

</body>
</html>
