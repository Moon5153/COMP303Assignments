<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>Login Page</title>
</head>
<body>
	<div class="container">
		<form action="home" method="POST" class="card-wrapper">
			<div class="row">
				
					<div class="col-md-6 form-container">
						</br>
						<h1>Log In</h1></br>
						<c:if test="${error != null}">
							<p class="alert alert-danger">${error}</p>
						</c:if>
						<c:if test="${message != null}">
							<p class="alert alert-success">${message}</p>
						</c:if>
	    				<input type="email" name="email" id="email" class="form-control" placeholder="Email"/></br>
	      				<input type="password" name="password" id="password" class="form-control" placeholder="password"/></br>
	     				<input type="submit" value="Login" class="button"/></br>
	      				<a href="register">New User? Create Account</a>
					</div>
					<div class="col-md-6 img-container">
						<img src="/img/login2.jpg" class="img-responsive">
					</div>
				
			</div>
			
  		 </form>
	
		
	</div>
	
	
</body>
</html>