<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:forEach var="game" items="${gameDetails}">
	
	<c:set var="id" value="${game.gameID}"/>
	<c:set var="name" value="${game.name}"/>
	<c:set var="des" value="${game.description}"/>
	<c:set var="price" value="${game.price}"/>
	
	Name		:${game.name}<br><br>
	Description	:${game.description}<br><br>
	Price		:${game.price}<br><br>
	
	</c:forEach>
	
	<c:url value="UpdateGame.jsp" var="gameupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="des" value="${des}"/>
		<c:param name="price" value="${price}"/>
	</c:url>
	
	<a href = "${gameupdate}">
	<input type = "button" name = "update" value = "Update Game">
	</a>
	
	
	<c:url value="DeleteGame.jsp" var="gamedelete">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="des" value="${des}"/>
		<c:param name="price" value="${price}"/>
	</c:url>
	
	<a href = "${gamedelete}">
	<input type = "button" name = "delete" value = "Delete Game">
	</a>
	
</body>
</html>