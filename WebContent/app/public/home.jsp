<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Welcome to: ${web}</h1>
	<p><%= request.getRequestURI() %></p>
	<p><%= application.getResource("/app/public/img/lanscapeLuna.jpg") %></p>
	<p><%= application.getRealPath("/app/public/img/lanscapeLuna.jpg") %></p>
	<img alt="fondo" src="resources/luna.jpg">
</body>
</html>