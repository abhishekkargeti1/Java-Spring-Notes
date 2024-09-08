<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered Successfully</title>
</head>
<body>
	<h1>Name is ${user.user_name}</h1>
	<h1>Email is ${user.user_email}</h1>
	<h1>Password is ${user.user_password}</h1>
	<h1>Address is ${user.address.city}</h1>
	<h1>Address is ${user.address.street}</h1>
	<h1>Gender is ${user.user_gender}</h1>
	<h1>DOB is ${user.user_DOB}</h1>
	<h1>Student type ${user.user_type} </h1>
</body>
</html>