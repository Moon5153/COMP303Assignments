<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Page</title>

<!-- Botstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css"/>

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
					<li class="nav-item"><a class="nav-link active" href="policy">Policy</a>
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
		</nav></br>
		
		
		<form action="policy" method="POST">
			<div class="row">
				<div class="col-md-6">
					<label>Policy Id:</label>
					<input type="number" name="policyId" class="form-control" value="${policy.policyId }" required/> </br>
					<label>Effective Date :</label> 
					<input type="date" name="effectiveDate" class="form-control" id="effectiveDate" value="${policy.effectiveDate }" required/></br>
					 <label>Total Amount :</label> 
					 <input type="text" name="totalAmount" class="form-control" id="totalAmount" value="${policy.totalAmount }" required/></br>
				</div>
				<div class="col-md-6">
					<label>Policy No:</label>
					<input type="number" name="policyNo" class="form-control" value="${policy.policyNo }" required/> </br>
					<label>Expire Date :</label> 
					<input type="date" name="expDate" id="expDate" class="form-control" value="${policy.expDate }" required/></br>
					<label>Status :</label> 
					<input type="text" name="status" id="status" class="form-control" value="${policy.status }" required/></br>
				</div>
			</div>
			 <input type="submit" class="button">
			
   </form></br>
    <input type="button" id="renew" class="button" onclick="change()" value="Renew" style="visibility:hidden"/>
	</div>
	
	
   
<script type="text/javascript">

var btn =document.getElementById('renew');
var status =document.getElementById('status').value;
if(status=="Expired"){
	btn.style.visibility="visible";
}
else{
	btn.style.visibility="hidden";
}
function change(){
	document.getElementById('status').value="Active";
	document.getElementById('totalAmount').value="1200";
	document.getElementById('renew').style.visibility="hidden";
	
	
	//set effective date to current date
	var currentDate=new Date();
	var formattedDate=currentDate.toISOString().split('T')[0];
	var effectiveDate=document.getElementById('effectiveDate').value=formattedDate;

	
	
	//extend expiry date by 90 days 
	var date = new Date();        
    date.setDate(date.getDate() + 90);
    var newExpDate=date.toISOString().split('T')[0];
    var expDate=document.getElementById('expDate').value=newExpDate;
    
}
</script>

</body>
</html>