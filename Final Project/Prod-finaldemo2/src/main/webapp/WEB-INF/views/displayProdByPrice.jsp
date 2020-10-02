<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="/resources/css/style5.css" />" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
</head>
<body>
<p id="hd">
Product Details:
</p>

<table border="border" width="50%">
<tr id="trh"> <td> Name </td> <td> Id </td> <td> Price </td> <td>Description</td>  </tr>

<c:forEach items="${pd}" var="pd">
<tr id="trd">
<td>  ${pd.prodName} </td>
<td>  ${pd.prodId} </td>
<td>  ${pd.price} </td>
<td>  ${pd.descp} </td>
</tr>
</c:forEach>

</table>

<form action="dispUser">
<input type="submit" id="bck" value="Get back to main page" class="btn btn-warning">
</form>

</body>
</html>
