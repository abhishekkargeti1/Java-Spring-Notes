<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<script src="<c:url value="/resources/js/script.js"/>"></script>
<title>Home</title>
</head>
<body>

<img alt="img" src="<c:url value="/resources/image/Abhishekpic.jpg"/>">
	<div class="container mt-5">
		<h3 class="text-center">Registration Form</h3>
		<%-- <div class="alert alert-danger" role="alert">${result}</div> --%>
		
		<div class="alert alert-danger" role="alert"><form:errors path="alert.*"/></div>
		
		<form action="processform" method="Post">
			<div class="form-group">
				<label for="Name">Name</label> <input type="text"
					class="form-control" id="name" aria-describedby="name"
					name="user_name" placeholder="Enter your name">

				<div class="card">
					<div class="card-body">
						<p>Your Address</p>
						<div class="form-group">
							<input class="form-control" type="text" name="address.street"
								placeholder="Enter Your Street">
						</div>
						<div class="form-group">
							<input class="form-control" name="address.city" type="text"
								placeholder="Enter Your City">
						</div>
					</div>
				</div>

				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					name="user_email" aria-describedby="emailHelp"
					placeholder="Enter email"> <small id="emailHelp"
					class="form-text text-muted">We'll never share your email
					with anyone else.</small> <label for="Password">Password</label> <input
					type="password" class="form-control" id="password"
					name="user_password" aria-describedby="emailHelp"
					placeholder="Enter your password"> <label for="DOB">DOB</label>
				<input type="date" name="user_DOB" class="form-control" id="DOB"
					name="user_DOB" aria-describedby="DOB" placeholder="dd/mm/yyyy">

				<label>Gender</label> <br> Male <input type="radio"
					value="Male" name="user_gender"> Female <input type="radio"
					value="Female" name="user_gender"> Other <input
					type="radio" value="Other" name="user_gender"> <br> <label>Select
					Your Courses</label>
				<div class="input-group mt-2">
					<div class="input-group-prepend">
						<label class="input-group-text" for="inputGroupSelect01">Options</label>
					</div>
					<select class="custom-select" id="inputGroupSelect01"
						name="user_course">
						<option selected>Choose...</option>
						<option value="Java">Java</option>
						<option value="Python">Python</option>
						<option value="Rust">Rust</option>
						<option value="C++">C++</option>
						<option value="GO">GO</option>
						<option value="C">C</option>
					</select>
				</div>


				<label>Student Type</label>
				<div class="input-group mt-2">
					<div class="input-group-prepend">
						<label class="input-group-text" for="inputGroupSelect01">Options</label>
					</div>
					<select class="custom-select" id="inputGroupSelect01"
						name="user_type">
						<option selected>Choose...</option>
						<option value="old">Old Student</option>
						<option value="new">New Student</option>
					</select>
				</div>

				<div class="container text-center">
					<button type="submit" class="btn btn-outline-primary mt-3">Submit</button>
				</div>
			</div>
		</form>
	</div>









	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>
