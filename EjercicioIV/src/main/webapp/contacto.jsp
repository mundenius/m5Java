<%-- autores  --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacto</title>
<link rel="stylesheet" href="/EjercicioIV/src/main/webapp/assets/stylesheet.css">

</head>
<body>
	<h1>Contacto</h1>

	<form action="FormularioContacto" method="POST">
		<label>Nombre:</label> <input type="text" name="nombre" required>
		
		<label>Email:</label> <input type="email" id="email" name="email" required> 
		 
		<label for="mensaje">Mensaje:</label>
		 
		<textarea id="mensaje" name="mensaje" rows="4" cols="50" required></textarea>

		<input type="submit" value=enviar />
	</form>

</body>
</html>
