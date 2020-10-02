<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Admin Page</title>
	<link href="<c:url value="/resources/css/style10.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
</head>
<body>

<pre id="logo">
<strong>Little 
Basket
</strong>
</pre>

<p id="hd">
Hello Admin!
</p>

<form action="saveProd" id="svp">
<input type="submit" value="Create Product" class="btn btn-dark">
</form>

<form action="updatePage" id="ufm">
<input type="submit" value="Update Product by Name" class="btn btn-dark">
</form>

<form action="dltProdById" id="dfm1">
<input type="submit" value="Delete Product by Id" class="btn btn-dark">
</form>

<form action="dltProdByName" id="dfm2">
<input type="submit" value="Delete Product by Name" class="btn btn-dark">
</form>

</body>
</html>
