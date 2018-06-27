<%@page import="io.amecodelabs.repository.DataRepository"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page import="io.amecodelabs.model.Person"  %>
<%@ page import="io.amecodelabs.repository.DataRepository"  %>

<%!
	Person person = Person.createPersonDefault();
	DataRepository data = DataRepository.getRepository();
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WonderFul</title>
</head>
<body>
	<%= data %>
	<h1>Welcome to WonderFul</h1>
	<p><%= person.getNames() + " | " + person.getLastNames()  %></p>
	<ul>
	<% for(String valueCurrent: data.getData()) {%>
		<li><%= valueCurrent %></li>
	<% } %>
	</ul>

</body>
</html>