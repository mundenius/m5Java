<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
#popup {
	position: fixed;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 300px;
	padding: 20px;
	background-color: #ffffff;
	border: 1px solid #cccccc;
	border-radius: 5px;
	box-shadow: 0px 0px 10px #cccccc;
}
</style>

</head>
<body>
	<div class="body"></div>
	<div class="grad"></div>
	<div class="header">
		<div>
			Site<span>Random</span>
		</div>
	</div>
	<br>
	<form action="Login" method="POST">
		<div class="login">
			<input type="text" placeholder="username" name="usuario"><br>
			<input type="password" placeholder="password" name="pass"><br>
			<input type="submit" value="Login">
		</div>
	</form>

	<%-- ventana emergente en caso de error --%>
	<% if(request.getAttribute("datosInvalidos") != null) { %>
		<div id="popup">
			<p><%= request.getAttribute("datosInvalidos") %></p> 
		</div>
	<% } %>
</body>
</html>
