<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<form method="post">
	<input type="number" name="a" value="${a }"/> *
	<input type="number" name="b" value="${b }"/> 
	<input type="submit" value="="/>
	<span>${result}</span>
</form>

</body>
</html>
