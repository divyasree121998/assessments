<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="/resources/css/style9.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
</head>
<body>
<p id="hd">
Please enter product details  
</p>

<form action="dispAdmin" >

<table id="tblad">

<tr><td>Name:</td><td><input type="text" name="prodName"></td></tr>

<tr><td>Id:</td><td><input type="text" name="prodId"></td></tr>

<tr><td>Price:</td><td><input type="text" name="price"></td></tr>

<tr><td>Description:</td><td><input type="text" name="descp"></td></tr>

<tr><td></td><td><input type="submit" value="Save Product" class="btn btn-success"></td></tr>

</table>
</form>




</body>
</html>
