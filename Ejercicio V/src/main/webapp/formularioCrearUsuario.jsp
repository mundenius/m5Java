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
<title>Registro</title>
<link rel="stylesheet" href="assets/stylesheet.css">
</head>
<body>

	<h1>Registro usuario</h1>
<%@include file = "FIJOS/Navbar.jsp"%>

	<form action="FormularioCrearUsuario" method="POST">  
	
		<label>ID Usuario:</label> <input type="text" name="idusuario" required>
		
		<label>RUN: </label> <input type="text" name="run" required><br>
		
		<label>Nombre: </label> <input type="text" name="nombre" required>
		
		<label>Apellido: </label> <input type="text" name="apellido" required>
		
		<label>Fecha de nacimiento: </label> <input type="date" name="fechanacimiento" required>
		
		
		
		<input type="submit" value="Enviar"/>
		
		
		
	</form>

</body>
<footer>
<%@include file= "FIJOS/Footer.jsp" %>
</footer>
</html>
