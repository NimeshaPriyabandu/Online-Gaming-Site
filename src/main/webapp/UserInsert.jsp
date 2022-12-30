<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insert" method="post">
	
		UserName <input type="text" name="username"><br><br>
		First Name <input type="text" name="firstname"><br><br>
		Last Name <input type="text" name="lastname"><br><br>
		Email <input type="text" name="email"><br><br>
		Mobile Number <input type="text" name="mobilenumber"><br><br>
		Gender <input type="text" name="gender"><br><br>
		Date Of Birth <input type="date" name="dob"><br><br>
		Password <input type="password" name="psw"><br><br>
		
		<input type="submit" name="submit" value="Create User"><br>
		
	</form>
</body>
</html>