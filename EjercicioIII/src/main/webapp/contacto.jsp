<%-- autores  --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
crossorigin="anonymous">
<title>Contacto</title>
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
