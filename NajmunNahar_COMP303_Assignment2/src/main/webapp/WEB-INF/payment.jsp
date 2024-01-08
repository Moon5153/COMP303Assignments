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

<title>Payment</title>
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
					<li class="nav-item"><a class="nav-link active" href="payment">Payment</a>
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
		</nav></br>
		<h1>Make Payment</h1>
		<form action="processPayment" method="POST">
			<div class="row">
				<div class="col-md-6">
					<div class="row">
						<div class="col-md-6">
						<label>Driver Id:</label>
						<input type="number" name="driverId" value="${id}" class="form-control" readonly required /> </br>
						<label>Card No: </label>
					  	<input type="number" name="cardNo" class="form-control" required /> </br>
					  	<label>Payment Date :</label> <input type="date" name="paymentDate" class="form-control" required /></br>
					</div>
					<div class="col-md-6">
						<label>Payment Method: </label>
						  <select name="paymentMethod" id="paymentMethod" class="form-control" required >
						      <option>Credit</option>
						      <option>Debit</option>
						      <option>PayPal</option>
						  </select></br>		  
						  <label>CIV: </label>
						  <input type="number" class="form-control" required /> </br>
						  <label>Amount :</label> <input type="number" name="amount" min=5 step="any" class="form-control" required /></br>
					</div>
					</div>       			
	       			 <input type="submit" class="button" value="Make Payment"/>
				</div>
				<div class="col-md-6 credit">
					<img src="/img/credit.png" class="img-fluid"/>
				</div>
			</div>  
	   </form>
	</div>
	
</body>
</html>