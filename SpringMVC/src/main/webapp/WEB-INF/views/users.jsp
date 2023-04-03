<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
	<h2>Update User</h2>
	<form action="update">
		Id: <input type="number" name="id" /> Name: <input type="text"
			name="name" /> Email: <input type="email" name="email" /> Password:
		<input type="text" name="password" /> <input type="submit"
			value="update user" />
	</form>

	<h2>Find User</h2>
	<form action="findId">
		Id: <input type="number" name="id" /> <input type="submit"
			value="update user" />
	</form>
	
	<c:if test="${user}">
		<p>User found ${user}</p>
	</c:if>

	<ul>
		<c:forEach var="user" items="${users}">
			<li>${user.id} | ${user.name} | ${user.email}</li>
		</c:forEach>
	</ul>
</body>
</html>