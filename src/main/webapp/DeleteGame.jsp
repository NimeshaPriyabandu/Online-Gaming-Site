<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String des = request.getParameter("des");
		String price = request.getParameter("price");
	%>
	
	<h1>Delete Game</h1><br><br>
	
	<form action="delete" method="post">
		Game ID		:<input type= "text" name="gameId" value="<%= id %>" readonly><br><br>
		Name		:<input type="text" name="name" value="<%= name %>" readonly><br><br>
		Description	:<input type="text" name="description" value="<%= des %>" readonly><br><br>
		Price		:<input type="text" name="price" value="<%= price %>" readonly><br><br>
		
		<input type="submit" name="submit" value="Delete Game"><br>
	</form>
</body>
</html>