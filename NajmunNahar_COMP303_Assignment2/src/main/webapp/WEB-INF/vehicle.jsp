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

<title>Vehicle Page</title>
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

					<li class="nav-item"><a class="nav-link active" href="vehicle">Vehicle</a>
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
		<c:if test="${message != null}">
			<p class="alert alert-success">${message}</p>
		</c:if>
		
		<div class="row">
			<div class="col-md-6">
				<form action="vehicle" method="POST">
					<div class="row">
						<div class="col-md-6">
							<label>Policy Id:</label> <input type="number" name="policyId" class="form-control" required value="${vehicle.policyId }" /></br>
					        <label>VIN Number:</label> <input type="text" name="vinNo" maxlength="14" class="form-control" required value="${vehicle.vinNo }"/></br>
					        <label>Year:</label> <input type="number" min=1900 max=2040 name="year" class="form-control" required value="${vehicle.year }"/></br>
						</div>
						<div class="col-md-6">
							 <label>Make/Brand:</label> <input type="text" name="make" class="form-control" required value="${vehicle.make }"/></br>
						      <label>Model:</label> <input type="text" name="model" class="form-control" required value="${vehicle.model }"/></br>
						      <label>Milage/Kilometer :</label> <input type="number" class="form-control" required step="any" name="mileage" value="${vehicle.mileage}"/></br>
						</div>
					</div>		     
      				  <input type="submit" class="button"/>
   </form>
			</div>
			<div class="col-md-6 car">
				<img src="/img/car.jpg" class="img-fluid"/>
			</div>
		</div>
		
		
	</div>
	

</body>
</html>