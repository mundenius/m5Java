<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacto</title>
</head>
<body>
	<h1>Contacto</h1>
	<form method="post" action="EnviarMensaje">
		<label for="nombre">Nombre:</label> <input type="text" id="nombre"
			name="nombre" required><br>
		<br> <label for="email">Email:</label> <input type="email"
			id="email" name="email" required><br>
		<br> <label for="mensaje">Mensaje:</label><br>
		<textarea id="mensaje" name="mensaje" rows="4" cols="50" required></textarea>
		<br>
		<br> <input type="submit" value="Enviar">
	</form>

</body>
</html>
