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
		<form action="EditarCliente" method="POST" class="form" id="adminForm">
			<h1 class="title">Editar Cliente</h1>
			
			<div class="inputContainer">
				<label for="" class="label">Ingrese el RUT del Usuario que desea editar: </label> <input type="text"
					class="input" placeholder="11111111-1" name="rut" id="rut">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Nombre: </label> <input type="text"
					class="input" placeholder="nombre" name="nombre" id="nombre" pattern="[A-Za-z ]{1,50}">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Apellido:</label> <input type="text"
					class="input" placeholder="apellido" name="apellido" id="apellido" pattern="[A-Za-z ]{1,50}">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Fecha de nacimiento: </label> <input
					type="date" class="input" name="fechaNacimiento">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Telefono:</label> <input type="text"
					class="input" placeholder="12345678" name="telefono" id="telefono">
			</div>

			<div class="inputContainer">
				<label for="" class="label">AFP: </label> <input type="text"
					class="input" placeholder="AFP" name="afp" id="afp" pattern="[A-Za-z ]{1,50}">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Sistema de Salud: </label> <input
					type="text" class="input" placeholder="FONASA - ISAPRE"
					name="sistemasalud" id="sistemasalud" pattern="[A-Za-z ]{1,50}">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Direccion:</label> <input type="text"
					class="input" placeholder="5 oriente 1090" name="direccion" id="direccion" pattern="[A-Za-z0-9 _-]{1,50}">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Comuna: </label> <input type="text"
					class="input" placeholder="Quilpue, Viña del Mar, etc"
					name="comuna" id="comuna" pattern="[A-Za-z0-9 _-]{1,50}">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Edad: </label> <input type="text"
					class="input" placeholder="0-100" name="edad" id="edad" pattern="[0-9]+">
			</div>

			<input type="submit" class="submitBtn" value="Editar Cliente">
		</form>
	</div>
</body>
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
<script>
        function validarFormulario() {
        	
        	var rut = document.getElementById("rut").value.trim();
            var nombre = document.getElementById("nombre").value.trim();
            var apellido = document.getElementById("apellido").value.trim();
            var telefono = document.getElementById("telefono").value.trim();
            var afp = document.getElementById("afp").value.trim();
			var sistemasalud = document.getElementById("sistemasalud").value.trim();
			var direccion = document.getElementById("direccion").value.trim();
			var comuna = document.getElementById("comuna").value.trim();
			var edad = document.getElementById("edad").value.trim();
            
			if (rut == "") {
                alert("Por favor, ingrese rut a editar.");
                return false;
            }
			
            if (nombre == "") {
                alert("Por favor, ingrese nombre a editar");
                return false;
            }

            if (apellido == "") {
                alert("Por favor, ingrese apellido a editar");
                return false;
            }

            
            if (telefono == "") {
                alert("Por favor, ingrese numero de telefono a editar");
                return false;
            }

            if (afp == "") {
                alert("Por favor, ingrese Afp a editar");
                return false;
            }
            
            if (sistemasalud == ""){
            	alert("por favor ingrese sistema de salud");
            	return false;
            }
            
            if (direccion == ""){
            	alert("Por favor, ingrese direccion a editar");
            	return false;
            }

            if (comuna == ""){
            	alert("Por favor ingrese comuna a editar");
            	return false;
            }
            
            if (edad == ""){
            	alert("Por favor, ingrese su edad.");
            	return false;
            }
            return true;
        }

        document.getElementById("adminForm").onsubmit = function() {
            return validarFormulario();
        };
    </script>
</footer>
</html>