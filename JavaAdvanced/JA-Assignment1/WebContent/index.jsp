<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment1</title>
</head>
<body>
	Exercise 1 <br>
	
	Q1 <br>
	a.
	<h1>Hello World</h1>
	b. <br>
	<%out.print("welcome to jsp"); %>
	<br>
	
	Q2 <br>
	Current Time: <%=java.util.Calendar.getInstance().getTime() %>
	<br>
	
	Q3 <br>
	<%!String name = "VTI ACADEMY";%>
	<%="Hello " + name%>
	<br>
	
	Q4 <br>
	<%@ page import="java.util.Date"%>
	Today is: <%=new Date() %>
	
</body>
</html>