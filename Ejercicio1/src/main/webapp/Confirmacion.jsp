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
	background-color: #f7f7f7;
	color: #444;
	margin: 0;
	padding: 0;
}

.container {
	max-width: 800px;
	margin: 0 auto;
	padding: 50px 20px;
	box-sizing: border-box;
}

h1 {
	font-size: 2.5rem;
	text-align: center;
	margin-bottom: 30px;
	color: #333;
}

.btn {
	display: inline-block;
	background-color: #3bb3e0;
	color: #fff;
	padding: 10px 20px;
	border-radius: 5px;
	text-decoration: none;
	font-size: 1.1rem;
	margin-top: 30px;
}

.btn:hover {
	background-color: #2b96b8;
}
</style>

</head>
<body>
	<div class="container">
		<h1>¡Gracias por contactarnos!</h1>
		<p>Recibimos tu mensaje y nos pondremos en contacto contigo.</p>

		<a href="index.jsp" class="btn">Regresar al inicio</a>
	</div>
</body>
</html>