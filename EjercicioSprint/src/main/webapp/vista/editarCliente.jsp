<%-- autores:
Javiera Saavedra
Valentina Saldias
Adrian Fredes 
Carlos Carrasco --%>

<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Cliente</title>
<link rel="stylesheet" href="vista/assets/stylesheet.css">
</head>
<body>
<%@include file = "/FIJOS/Navbar.jsp"%>
	<div class="signupFrm">
		<form action="EditarClientes" method="POST" class="form">
			<h1 class="title">Editar Cliente</h1>
			
			<div class="inputContainer">
				<label for="" class="label">Ingrese el RUT del Cliente que desea editar: </label> <input type="text"
					class="input" placeholder="11111111-1" name="rut">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Nombre: </label> <input type="text"
					class="input" placeholder="nombre" name="nombre">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Apellido:</label> <input type="text"
					class="input" placeholder="apellido" name="apellido">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Fecha de nacimiento: </label> <input
					type="date" class="input" name="fechaNacimiento">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Telefono:</label> <input type="text"
					class="input" placeholder="12345678" name="telefono">
			</div>

			<div class="inputContainer">
				<label for="" class="label">AFP: </label> <input type="text"
					class="input" placeholder="AFP" name="afp">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Sistema de Salud: </label> <input
					type="text" class="input" placeholder="FONASA - ISAPRE"
					name="sistemasalud">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Direccion:</label> <input type="text"
					class="input" placeholder="5 oriente 1090" name="direccion">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Comuna: </label> <input type="text"
					class="input" placeholder="Quilpue, Viña del Mar, etc"
					name="comuna">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Edad: </label> <input type="text"
					class="input" placeholder="0-100" name="edad">
			</div>

			<input type="submit" class="submitBtn" value="Editar Cliente">
		</form>
	</div>
</body>
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
</footer>
</html>