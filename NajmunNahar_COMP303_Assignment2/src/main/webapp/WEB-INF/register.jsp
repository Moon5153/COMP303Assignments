<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Botstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css"/>
<title>Registration Page</title>
</head>
<body>
	<div class="container card-wrapper2">
		<form action="add" method="POST">
			<div class="row">
				<div class="col-md-6 signup-container">
					<h1>Sign Up</h1></br>
					<div class="row">
						<div class="col-md-6">
						<small>First Name:</small>
						<input type="text" name="firstName" class="form-control" placeholder="First Name" required/></br>
						<small>Date of Birth</small>
		      			<input type="date" name="dateOfBirth" class="form-control" id="dob" required/></br>
		      			<small>License No:</small>
		      			<input type="text" name="licenseNo"  minlength="14" maxlength="14" class="form-control" placeholder="License No:" required/></br>
		      			<small>Email</small>
						<input type="email" name="email" class="form-control" placeholder="example@gmail.com" required/></br>
					</div>
					<div class="col-md-6">
						<small>Last Name:</small>
						<input type="text" name="lastName" class="form-control" placeholder="Last Name" required/></br>
						<small>Phone Number: </small>
					    <input type="number" name="phoneNumber" class="form-control" placeholder="Phone Number" required/></br>
					    <small>License Status: </small>
					     <select name="licenseState" id="licenseState" class="form-control">
					      <option>Active</option>
					      <option>Expired</option>
					      <option>Suspended</option>
					     </select></br>
					     <small>Password</small>
					     <input type="password" name="password" class="form-control" placeholder="Password" required/></br>						
					</div>
					</div>
						<small>Address:</small>     
		      			<input type="text" name="address" class="form-control" placeholder="Address" required/></br>
		      			<small>Policy Id:</small>   
		      			<input type="number" name="policyId" class="form-control" required/></br>
		      			<input type="submit" value="Sign Up" class="button"/>
		      			<a href="index">Already have an account?</a>
				</div>
				<div class="col-md-6 sign-up">
					<img src="/img/signup.png" class="img-responsive"/>
				</div>
			</div>
		      
   		</form>
	</div>
	
</body>
</html>