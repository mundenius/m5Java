<%-- comentarios, agregar autores etc --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Confirmación de contacto</title>
	<style>
		body {
		    font-family: Arial, sans-serif;
		    background-color: #D1F2EB;
		    color: #000000;
		}

css

	h1 {
		text-align: center;
		margin-top: 50px;
		color: #000000;
	}

	li {
		display: block;
		margin-top: 10px;
		color: #000000;
	}
</style>

</head>
<body>
	<h1>¡Gracias por contactarnos!</h1>
	<p>Recibimos tu mensaje y nos pondremos en contacto contigo.</p>
	<br><br>
	<h2>Detalles del mensaje:</h2>
	<ul>
		<li>No	 ${nombre}</li>
		<li>Email: ${email}</li>
		<li>Mensaje: ${mensaje}</li>
	</ul>
</body>
</html>