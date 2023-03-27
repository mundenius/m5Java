<%-- pagina index donde se despliega el login --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>Site<span>Random</span></div>
		</div>
		<br>
		<form action="/Login.java" method = "POST">
		<div class="login">
				<input type="text" placeholder="username" name="usuario"><br>
				<input type="password" placeholder="password" name="pass"><br>
				<input type="button" value="Login">
		</div>
		</form>
</body>
</html>