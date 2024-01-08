<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration result</title>

<!-- Botstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
<link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<div class="container d-flex flex-column align-items-center result_wrapper">
		</br><h5>Welcome ${ insurance.fname }.</h5>
		<h6 class="title">Your Car Insurance Quotation details are as follows:</h6>
		<div class="row">
			<div class="col-md-12 first_wrapper">
				<ul>
					<li><span>Phone Number:</span> ${ insurance.phone }</li>
					<li><span>Email Address:</span> ${ insurance.email }</li>
					<li><span>Address:</span> ${ insurance.address }, ${ insurance.city }, ${ insurance.state }, ${ insurance.postcode }</li>
				</ul>
				<div class="col-md-12 list_wrapper">
					<div class="col-md-2"></div>
					<div class="col-md-10">
						<ul>
							<li><span>Car Brand:</span> ${ insurance.carBrand }</li>
							<li><span>Car Model:</span> ${ insurance.carModel }</li>
							<li><span>Year:</span> ${ insurance.year }</li>
							<li><span>Kilometers:</span> ${ insurance.kilometers }</li></br>
							
							<li><span>Number of Drivers:</span> ${ insurance.numOfDrivers }</li>
							<li><span>Driving Experience:</span> ${ insurance.numOfExperience } years</li>
							<li><span>Type of Commute:</span> ${ insurance.commuteType }</li>
							<li><span>Currently Insured:</span> ${ insurance.isInsured }</li>
						</ul>
					</div>
				</div></br>
				<p>Thank you for your Car Insurance Quotation request.</p>
				<p>Your monthly premium is $230.</p>
			</div>
		</div>
		
	</div>
	
</body>
</html>