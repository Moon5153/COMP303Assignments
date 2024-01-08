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

<title>Home Page</title>
</head>
<body>
	<div class="container card-wrapper">
		<c:if test="${msg != null}">
			<p class="alert alert-success">${msg}</p>
		</c:if>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		  <a class="navbar-brand" href="home">Home</a>
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item">
		        <a class="nav-link" href="policy">Policy</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="payment">Payment</a>
		      </li>
		     
		      <li class="nav-item">
		        <a class="nav-link" href="vehicle">Vehicle</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="logout">Log Out</a>
		      </li>
		    </ul>
		      	<div class="nav-item">
		        	<a  href="view-profile"><img src="img/user.png" class="img-fluid icon" title="view profile"/></a>
		      	</div>    
		  </div>
		</nav>
		<div class="home_text">
    		<div class="col-md-12">
		      <div class="row">
		        <div class="col-md-6">
		          </br></br></br>
		          <h1>Welcome ${drivers.firstName}</h2>
		          <p><b>Mission:</b> Hello and Welcome! This is the official page for 'Auto Insurance Policy'. This home page will navigate you through the entire process. Thank you for Signing Up.</p>
		        </div>
		        <div class="col-md-6">
		         <img src="/img/survey3.png" alt="" class="img-fluid ">
		       </div> 
		      </div>       
		  </div>  
		</div>
	</div>
	
</body>
</html>