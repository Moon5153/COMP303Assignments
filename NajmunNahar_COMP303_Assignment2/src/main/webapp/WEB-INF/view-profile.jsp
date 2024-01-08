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

<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css" />

<title>Profile</title>
</head>
<body>
	<div class="container card-wrapper">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item"><a class="nav-link" href="home">Home</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="policy">Policy</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="payment">Payment</a>
					</li>

					<li class="nav-item"><a class="nav-link" href="vehicle">Vehicle</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="logout">Log
							Out</a></li>
				</ul>
				<div class="nav-item">
					<a href="view-profile"><img src="img/user.png"
						class="img-fluid icon" title="view profile" /></a>
				</div>
			</div>
		</nav>

		<form action="update-profile" method="POST">
			<div class="row">
				<div class="col-md-6 signup-container">
					<h1>Profile</h1>
					</br>
					<div class="row">
						<div class="col-md-6">
							<small>First Name:</small> <input type="text" name="firstName"
								class="form-control" value="${driver.firstName}" required /></br> <small>Date
								of Birth</small> <input type="date" name="dateOfBirth"
								class="form-control" id="dob" value="${driver.dateOfBirth}"
								required /></br> <small>License No:</small> <input type="text"
								name="licenseNo" class="form-control" placeholder="License No:" value="${driver.licenseNo }"
								required /></br> <small>Email</small> <input type="email"
								name="email" class="form-control"
								placeholder="example@gmail.com" value="${driver.email}" required /></br>
						</div>
						<div class="col-md-6">
							<small>Last Name:</small> <input type="text" name="lastName"
								class="form-control" placeholder="Last Name" value="${driver.lastName }" required /></br> <small>Phone
								Number: </small> <input type="number" name="phoneNumber"
								class="form-control" placeholder="Phone Number"
								value="${driver.phoneNumber}" required /></br> <small>License
								Status: </small> <select name="licenseState" id="licenseState"
								class="form-control">
								<option>Active</option>
								<option>Expired</option>
								<option>Suspended</option>
							</select></br> <small>Password</small> <input type="text" name="password"
								class="form-control" placeholder="Password"
								value="${driver.password}" required /></br>
						</div>
					</div>
					<small>Address:</small> 
					<input type="text" name="address" class="form-control" placeholder="Address" value="${driver.address}" required /></br> 
					<small>Driver Id:</small> 
					<input type="number" name="driverId" class="form-control" placeholder="Driver Id" value="${driver.driverId}" readonly required /></br>
					<input type="submit" value="Update" class="button" />
				</div>
				<div class="col-md-6 profile">
					<img src="/img/signup.png" class="img-responsive" />
				</div>
			</div>
		</form>
	</div>


</body>
</html>