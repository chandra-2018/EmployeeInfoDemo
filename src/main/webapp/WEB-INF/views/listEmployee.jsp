<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
<%@ include file="header.jsp" %>
</head>
<body>
	<header>
		<h1>Employee List</h1>
	</header>
	<a href="employee_form">Add Employee</a>
	<c:if test="${!empty employees}">
		<table class="table table-stripped">
			<thead>
				<tr>
					<th>SN</th>
					<th>Id</th>
					<th>Name</th>
					<th>Username</th>
					<th>Password</th>
					<th>Gender</th>
					<th>Hobbies</th>
					<th>Email</th>
					<th>Department</th>
					<th>DOB</th>
					<th>Mobile NO</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employees}" var="emp" varStatus="i">
					<tr>
						<td>${i.count}</td>
						<td>${emp.id}</td>
						<td>${emp.employeeName}</td>
						<td>${emp.userName}</td>
						<td>${emp.password}</td>
						<td>${emp.gender}</td>
						<td>${emp.hobbies}</td>
						<td>${emp.email}</td>
						<td>${emp.department}</td>
						<td>${emp.dob}</td>
						<td>${emp.mobileNo}</td>
						<td><a href="employee_edit?id=${emp.id }">Edit</a>|<a href="employee_delete?id=${emp.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</body>
</html>