<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

<title>Spring REST Example</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/userFormSubmit" method="post">
	<center>
		<h2>User Page</h2>
		
	</center>
	<a href="${pageContext.request.contextPath}">Go BACK</a>
	<table>
		<tr>
			<td> Enter firstname : </td>
			<td><form:input path="userDetail.firstName" />
		</tr>
		<tr>
			<td> Enter lastname : </td>
			<td><form:input path="userDetail.lastName" />
		</tr>
		<tr>
			<td> Enter email : </td>
			<td><form:input path="userDetail.lastName" />
		</tr>
		<tr>
			<td colspan="2"> 
				<input type="submit">
			</td>
			
		</tr>
	</table>
</form>	
</body>
</html>