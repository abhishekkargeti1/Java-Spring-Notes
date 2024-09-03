<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		String name= (String) request.getAttribute("Name");
	%>
	<h1>This is help Page</h1>
	<h2>My name is <%= name %></h2>
	
</body>
</html>