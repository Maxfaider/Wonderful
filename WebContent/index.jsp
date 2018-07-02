<%@page import="io.amecodelabs.repository.DataRepository"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page import="io.amecodelabs.model.Person"  %>
<%@ page import="io.amecodelabs.repository.DataRepository"  %>
<%@ page import="java.util.List"  %>

<%!Person person = Person.createPersonDefault();%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WonderFul</title>
</head>
<body>
	
	<p>${applicationScope.dataRepository}</p>
	<h1>Welcome to WonderFul</h1>
	<p><%= request.getRequestURL() %></p>
	<p><%= person.getNames() + " | " + person.getLastNames()  %></p>
	<% List<String> data = ((DataRepository) application.getAttribute("dataRepository")).getData(); %>
	<ul>
		<c:forEach var = "i" items = "${applicationScope.dataRepository.getData()}">
			<li> <c:out value = "${i}"/> </li>
     	</c:forEach>
	</ul>
	
	<img alt="fondo" src="spring/resources/luna.jpg">

</body>
</html>