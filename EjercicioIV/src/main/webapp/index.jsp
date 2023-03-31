<%-- autores:
Javiera Saavedra
Valentina Saldias
Adrian Fredes 
Carlos Carrasco --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="/EjercicioIV/src/main/webapp/assets/stylesheet.css">


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
