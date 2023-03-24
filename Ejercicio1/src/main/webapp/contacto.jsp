<%-- autores  --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacto</title>
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
	border-radius: 5px;
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
	bor	der-radius: 5px;
	cursor: pointer;
	font-size: 16px;
	margin-top: 10px;
}

input[type="submit"]:hover {
	background-color: #555555;
}
</style>
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
