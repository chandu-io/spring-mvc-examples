<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Todo List</title>
</head>
<body>
	<h2>Todo List</h2>
	<form:form modelAttribute="todo" action="todo-list" method="POST">
		<h3>New task</h3>
		<form:input path="task" placeholder="Task name" />
		<input type="submit" value="Add task">
	</form:form>
	<br>
	<a href="home">&lt;&lt;&nbsp;Back</a>
	<h3>Tasks</h3>
	<c:choose>
	<c:when test="${empty tasks}">
	<p>No tasks at this point.</p>
	</c:when>
	<c:otherwise>
	<ol>
		<c:forEach items="${tasks}" var="task">
		<li>${task}</li>
		</c:forEach>
	</ol>
	</c:otherwise>
	</c:choose>
</body>
</html>
