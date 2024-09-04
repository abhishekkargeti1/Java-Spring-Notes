<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<h1>Form Register Successfully</h1>
	
	<h3>Your Details are</h3>
	<h4>Name ${user.user_name}</h4>
	<h4>Address ${user.user_address}</h4>
	<h4>Email ${user.user_email}</h4>
	<h4>Password ${user.user_password}</h4>
</body>
</html>