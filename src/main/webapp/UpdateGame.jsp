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


	<form action="update" method="post">
		Game ID		:<input type= "text" name="gameId" value="<%= id %>" readonly><br><br>
		Name		:<input type="text" name="name" value="<%= name %>"><br><br>
		Description	:<input type="text" name="description" value="<%= des %>"><br><br>
		Price		:<input type="text" name="price" value="<%= price %>"><br><br>
		
		<input type="submit" name="submit" value="Update Game"><br>
	</form>
</body>
</html>