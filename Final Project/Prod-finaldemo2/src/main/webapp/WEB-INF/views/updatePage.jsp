<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Update</title>
<link href="<c:url value="/resources/css/style11.css" />" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
</head>
<body>

<p id="hd">
To update product details -  
</p>

<form action="searchForUpdate" class="ufrm">
Id:<input type="text" name="prodId" value="${prod.prodId}">
<input type="submit" value="search" class="btn btn-success">
</form>


<form action="updateData" class="ufrm">
<table>
<tr><td>Name:</td><td><input type="text" name="prodName" value="${prod.prodName}"></td></tr>

<tr><td>Price:</td><td><input type="text" name="price" value="${prod.price}"></td></tr>

<tr><td>Description:</td><td> <input type="text" name="descp" value="${prod.descp}"></td></tr>

<tr><td></td><td><input type="submit" value="Update Product" class="btn btn-success"></td></tr>
</table>
</form>

<form action="dispAdmin">
<input type="submit" value="Get back to main page" class="btn btn-danger">
</form>

</body>
</html>
