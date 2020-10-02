<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="/resources/css/style1.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	

</head>
<body>

<pre id="logo">
<strong>Little 
Basket
</strong>
</pre>

<h1 id="hd">Hey there!</h1>
<p id="tl1">
It's an
</p>
<p id="tl12">
<strong>Add to Cart</strong> 
</p>
<p id="tl13">
kind of day!!!
</p>


<%-- 
<img alt="hpic" src="<c:url value="/resources/img/pic17.jpg"/>"/> --%>


<form action="dispUser">
<input type="submit" value="Shop now" id="shopnow" class="btn btn-success btn-lg">
</form>




</body>
</html>
