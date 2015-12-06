<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Name example</title>
</head>
<body>
	<c:choose>
	<c:when test="${ not empty name }">
	<p>You entered: ${ name }</p>
	<a href="name">&lt;&lt;&nbsp;Back</a>
	</c:when>
	<c:otherwise>
	<form action="name" method="POST">
		<label>Name: <input name="name-field" type="text"></label>
		<br><br>
		<input type="submit" value="Send name">
	</form>
	<br>
	<a href="home">&lt;&lt;&nbsp;Back</a>
	</c:otherwise>
	</c:choose>
</body>
</html>
