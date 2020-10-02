<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="/resources/css/wlcmstyle.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	

</head>
<body>

<pre id="logo">
<strong>Little 
Basket
</strong>
</pre>

<h1 id="hd">Hello, Welcome!</h1>




<%-- 
<img alt="hpic" src="<c:url value="/resources/img/pic17.jpg"/>"/> --%>


<form action="dispAdmin">
<input type="submit" value="Admin" id="ashop" class="btn btn-primary btn-lg">
</form>


<form action="homeUser">
<input type="submit" value="User" id="ushop" class="btn btn-primary btn-lg">
</form>





</body>
</html>
