<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Users</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>User Details</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
			
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>User Name</th>
					<th>Email</th>
					<th>Date of Birth</th>
				</tr>
				
				<!-- loop over and print our users -->
				<c:forEach var="tempCustomer" items="${users}">
				
					<tr>
						<td> ${tempCustomer.userName} </td>
						<td> ${tempCustomer.email} </td>
						<td> ${tempCustomer.dob} </td>
					</tr>
				
				</c:forEach>
				<tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="index.jsp">Home</a>
                        </td>
                    </tr>
					
			</table>
			
		</div>
	
	</div>
	

</body>

</html>









