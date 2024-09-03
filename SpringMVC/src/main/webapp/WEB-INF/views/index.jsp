<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>hello I am Home Page</h1>
	<% 
		String name=(String)request.getAttribute("name");
		int age =(int)request.getAttribute("age");
		List<String> details = (List<String>)request.getAttribute("details");
	
	%> 
	<h1>My name is <%=name%></h1>
	<h1>My Age is ${age} </h1>
	
	<%
			for(String s1 : details){
				
	
	%>
	<h1>Name of my Family member <%=s1%></h1>
	<%} %>
</body>
</html>