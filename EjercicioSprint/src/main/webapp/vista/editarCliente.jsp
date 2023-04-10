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
		<form action="EditarCliente" method="POST" class="form">
			<h1 class="title">Editar Cliente</h1>

			<div class="inputContainer">
				<input type="text" class="input" placeholder="nombre" name="nombre">
				<label for="" class="label">Nombre: </label>
			</div>

			<div class="inputContainer">
				<input type="text" class="input" placeholder="apellido"
					name="apellido"> <label for="" class="label">Apellido:
				</label>
			</div>

			<div class="inputContainer">
				<input type="date" class="input" name="fechaNacimiento"> <label
					for="" class="label">Fecha de nacimiento: </label>
			</div>

			<div class="inputContainer">
				<input type="text" class="input" placeholder="11111111-1" name="rut">
				<label for="" class="label">Rut: </label>
			</div>

			<div class="inputContainer">
				<input type="text" class="input" placeholder="12345678"
					name="telefono"> <label for="" class="label">Telefono:
				</label>
			</div>

			<div class="inputContainer">
				<input type="text" class="input" placeholder="AFP" name="afp">
				<label for="" class="label">AFP: </label>
			</div>

			<div class="inputContainer">
				<input type="text" class="input" placeholder="FONASA - ISAPRE"
					name="sistemasalud"> <label for="" class="label">Sistema de
					Salud: </label>
			</div>

			<div class="inputContainer">
				<input type="text" class="input" placeholder="5 oriente 1090"
					name="direccion"> <label for="" class="label">Direccion:
				</label>
			</div>

			<div class="inputContainer">
				<input type="text" class="input"
					placeholder="Quilpue, Viña del Mar, etc" name="comuna"> <label
					for="" class="label">Comuna: </label>
			</div>

			<div class="inputContainer">
				<input type="text" class="input" placeholder="0-100" name="edad">
				<label for="" class="label">Edad: </label>
			</div>

			<input type="submit" class="submitBtn" value="Editar Cliente">
		</form>
	</div>
</body>
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
</footer>
</html>