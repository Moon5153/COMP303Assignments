<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Drivers List</h1>  
<table border="2" width="70%" cellpadding="2">  
	<tr>
		<th>Driver Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Date of Birth</th>
		<th>Address</th>
		<th>Phone</th>
		<th>E-mail</th>
		<th>Password</th>
		<th>License No</th>
		<th>License state</th>
		<th>Policy Id</th>
	</tr>  
	
   <c:forEach var="dv" items="${drivers}">   
   <tr>  
   <td>${dv.driverId}</td> 
   <td>${dv.firstName}</td> 
   <td>${dv.lastName}</td>  
   <td>${dv.dateOfBirth}</td> 
   <td>${dv.address}</td>
   <td>${dv.phoneNumber}</td> 
   <td>${dv.email}</td>
   <td>${dv.password}</td>
   <td>${dv.licenseNo}</td>
   <td>${dv.licenseState}</td>
   <td>${dv.policyId}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>
   <a href="register">Add More Driver</a>
	<a href="edit">Edit</a>

</body>
</html>