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

 <link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" type="text/css"/>
<title>Insurance Quotation</title>
</head>
<body>
	<div class="container d-flex flex-column align-items-center form-wrapper">
		<h2 class="text-center">Car Insurance Quotation form</h2>
		<h6 class="text-center">Please fill the form for better assistance</h6>
		<form action="processForm" method="post">
			<label for="fname">Name <span class="red">*</span></label>
			<div class="row form-group">
				<div class="col-md-5 padding-right">
					<input type="text" class="form-control" id="fname" name="fname" area-describedby="firstname" required>
					<small id="firstname" class="form-text">First Name</small>
				</div>
				<div class="col-md-5 padding-right">
					<input type="text" class="form-control" id="lname" name="lname" area-describedby="lastname" required>
					<small id="lastname" class="form-text">Last Name</small>
				</div>
			</div>
			
			<div class="row form-group">
				<div class="col-md-6">
					<label for="phone">Phone Number <span class="red">*</span></label>
					<input type="tel" class="form-control" id="phone" name="phone" 
					placeholder="000-000-0000" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required>
				</div>
				<div class="col-md-6">
					<label for="email">E-mail</label>
					<input type="email" class="form-control" id="email" name="email" area-describedby="emailExample" 
					placeholder="ex: myname@example.com">
					<small id="emailExample" class="form-text">example@example.com</small>
				</div>
			</div>
			
			<div class="row form-group">
				<div class="col-md-12">
					<label for="address">Address <span class="red">*</span></label>
					<input type="text" class="form-control" id="address" name="address" area-describedby="streetAddress" required>
					<small id="streetAddress" class="form-text">Street Address</small>
				</div>
			</div>
			<div class="row form-group">
				<div class="col-md-12">
					<input type="text" class="form-control" id="addressline2" name="addressline2" area-describedby="streetAddress2">
					<small id="streetAddress2" class="form-text">Street Address Line 2</small>
				</div>
			</div>
			<div class="row form-group">
				<div class="col-md-6">
					<input type="text" class="form-control" name="city" area-describedby="city">
					<small id="city" class="form-text">City</small>
				</div>
				<div class="col-md-6">
					<input type="text" class="form-control" name="state" area-describedby="stateProvince">
					<small id="statePovince" class="form-text">State / Province</small>
				</div>
			</div>
			<div class="row form-group">
				<div class="col-md-12">
					<input type="text" class="form-control" name="postcode" area-describedby="postal">
					<small id="postal" class="form-text">Postal / Zip Code</small>
				</div>
			</div>
			
			<div class="row form-group">
				<div class="col-md-6">
					<label for="vin"">VIN# <span class="red">*</span></label>
					<input type="text" class="form-control" id="vin" name="vin" maxlength="14" required>
				</div>
			</div>
			<div class="row form-group">
				<div class="col-md-6">
					<label for="car_brand">Car Brand <span class="red">*</span></label>
					<select class="form-control custom-select" id="car_brand" name="carBrand" required>
						<option value="" selected disabled hidden>Please Select</option>
						<option value="Honda">Honda</option>
						<option value="BMW">BMW</option>
						<option value="Audi">Audi</option>
						<option value="Nissan">Nissan</option>
						<option value="Ford">Ford</option>
					</select>
				</div>
				<div class="col-md-6">
					<label for="car_model">Car Model <span class="red">*</span></label>
					<select class="form-control" id="car_model" name="carModel" required>
						<option value="" selected disabled hidden>Please Select</option>
					</select>
				</div>
			</div>
			
			<div class="row form-group">
				<div class="col-md-6">
					<label for="year">Year <span class="red">*</span></label>
					<input type="number" class="form-control" min="1900" max="2099" step="1" id="year" name="year" required/>
				</div>
				<div class="col-md-6">
					<label for="kilometers">Kilometers <span class="red">*</span></label>
					<input type="number" min="0" class="form-control" id="kilometers" name="kilometers" required>
				</div>
			</div>
			
			<div class="row form-group">
				<div class="col-md-6">
					<label for="numOfDrivers">Number of Drivers <span class="red">*</span></label>
					<select class="form-control" id="numOfDrivers" name="numOfDrivers" required>
						<option value="" selected disabled hidden>Please Select</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
					</select>
				</div>
				<div class="col-md-6">
					<label for="numOfExperience">Driving Experience <span class="red">*</span></label>
					<input type="number" min="0" class="form-control" id="numOfExperience" name="numOfExperience" required>
				</div>
			</div>
			
			<div class="row form-group">
				<div class="col-md-6">
					<p>Type of Commute <span class="red">*</span></p>
					<input type="radio" id="work" name="commuteType" value="Work" required>
					<label for="work">Work</label><br>
					<input type="radio" id="Leisure" name="commuteType" value="Leisure">
					<label for="leisure">Leisure</label><br>
				</div>
			</div>
			
			<div class="row form-group">
				<div class="col-md-6">
					<p>Are you Currently Insured <span class="red">*</span></p>
					<input type="radio" id="yes" name="isInsured" value="Yes" required>
					<label for="yes">Yes</label><br>
					<input type="radio" id="no" name="isInsured" value="No">
					<label for="no">No</label><br>
				</div>
			</div>
			<input class="btn btn-primary" type="submit" value="SUBMIT">
			<input class="btn btn-default" type="reset" value="RESET">
		</form>
	</div>	
</body>
 <script src="${pageContext.request.contextPath}/resources/script.js" type="text/javascript"></script>
</html>