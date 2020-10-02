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

<h1 id="hd">{status}</h1>





<form action="dispAdmin">
<input type="submit" value="Get back to main page" class="btn btn-success btn-lg">
</form>


</body>
</html>
