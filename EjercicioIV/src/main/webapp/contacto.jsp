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
<title>Contacto</title>
<link rel="stylesheet" href="assets/stylesheet.css">

</head>
<body>

	<h1>Contacto</h1>
<%@include file = "FIJOS/Navbar.jsp"%>
	<form action="FormularioContacto" method="POST">
		<label>Nombre:</label> <input type="text" name="nombre" required>
		
		<label>Email:</label> <input type="email" id="email" name="email" required> 
		 
		<label for="mensaje">Mensaje:</label>
		 
		<textarea id="mensaje" name="mensaje" rows="4" cols="50" required></textarea>

		<input type="submit" value=enviar />
	</form>

</body>
<footer>
<%@include file= "FIJOS/Footer.jsp" %>
</footer>
</html>
