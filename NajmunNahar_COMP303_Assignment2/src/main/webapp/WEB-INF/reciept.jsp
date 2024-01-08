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

<title>Receipt</title>
</head>
<body>
	<div class="container card-wrapper">
		<c:if test="${message != null}">
			<p class="alert alert-success">${message}</p>
		</c:if>
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
		
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-5">
				<h1>Receipt </h1></br>
				<p>Payment Method: ${payment.paymentMethod }</p>
				<p>Payment Date: ${payment.paymentDate }</p>
				<p>Amount Paid: ${payment.amount }</p>
				
			</div>
			<div class="col-md-4">
				<img src="/img/thank-you.png" class="credit"/>
			</div>
		</div>
		
	</div>

	

</body>
</html>