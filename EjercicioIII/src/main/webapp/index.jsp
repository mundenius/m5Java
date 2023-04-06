<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./assets/stylesheet.css">
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
crossorigin="anonymous">
	<title>Login</title>
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
