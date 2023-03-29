<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Login</title>
<style>
    body {
	font-family: Arial, sans-serif;
	background-color: #D1F2EB;
	color: #FFFFFF;
}

h1 {
	text-align: center;
	margin-top: 50px;
	color: #333333;
}

form {
	width: 50%;
	margin: 50px auto;
	background-color: #FFFFFF;
	border-radius: 5px;
	padding: 20px;
	box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.2);
}

label {
	display: block;
	margin-top: 10px;
	color: #333333;
}

input[type="text"], input[type="email"], textarea {
	width: 100%;
	padding: 10px;
	margin-top: 5px;
	margin-bottom: 10px;
	border-radius: 5px;
	border: 1px solid #CCCCCC;
	font-size: 16px;
	color: #333333;
	box-sizing: border-box;
}

input[type="submit"] {
	width: 100%;
	background-color: #333333;
	color: #FFFFFF;
	padding: 10px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	font-size: 16px;
	margin-top: 10px;
}

input[type="submit"]:hover {
	background-color: #555555;
}
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
	font-size: 20px;
    color: black;
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
		<label for="usuario"><Strong>Usuario</Strong></label>
		<input type="text" placeholder="Escriba usuario aqui" name="usuario" id="usuario"><br>
		<label for="pass"><Strong>Contraseña</Strong></label>
		<input type="password" placeholder="Escriba contraseña aqui" name="pass" id="pass"><br>
		<input type="submit" value="Login">
	</div>
</form>


	<%-- ventana emergente en caso de error --%>
	<% if(request.getAttribute("datosInvalidos") != null) { %>
		<div id="popup">
			<p> <%= request.getAttribute("datosInvalidos") %></p> 
		</div>
	<% } %>
</body>
</html>