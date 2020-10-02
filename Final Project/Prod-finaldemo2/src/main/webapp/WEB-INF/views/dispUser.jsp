<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>List</title>
	<link href="<c:url value="/resources/css/style2.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
</head>
<body>

<pre id="logo">
<strong>Little 
Basket
</strong>
</pre>

<h1>
<pre id="tl2">If you love it, buy it 
(before someone else does) </pre>
</h1>


<form action="getProdName">
<input type="submit" value="Search Product by Name" class="btn btn-light">
</form>

<form action="getProdId">
<input type="submit" value="Search Product by Id" class="btn btn-light">
</form>

<form action="getProdPrice">
<input type="submit" value="Search Product by Price" class="btn btn-light">
</form>

<form action="getProdDesc">
<input type="submit" value="Search Product by Description" class="btn btn-light">
</form>



<form action="done">
<input type="submit" value="Done with shopping?" class="btn btn-success">
</form>



</body>
</html>
