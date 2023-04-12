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
<title>Crear Cliente</title>
<link rel="stylesheet" href="vista/assets/stylesheet.css">
</head>
<body>
<%@include file = "/FIJOS/Navbar.jsp"%>
	<div class="signupFrm">
		<form action="CrearCliente" method="POST" class="form" id="crear">
			<h1 class="title">Crear Cliente</h1>

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
				<label for="" class="label">Rut: </label> <input type="text"
					class="input" placeholder="11111111-1" name="rut" id="rut" pattern="[0-9]+">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Telefono:</label> <input type="text"
					class="input" placeholder="12345678" name="telefono" id="telefono" pattern="[0-9]+">
			</div>

			<div class="inputContainer">
				<label for="" class="label">AFP: </label> <input type="text"
					class="input" placeholder="AFP" name="afp" id="afp" pattern="[a-z]{1,15}">
			</div>

			<div class="inputContainer">
				<label for="" class="label">Sistema de Salud: </label> <input
					type="text" class="input" placeholder="FONASA - ISAPRE"
					name="sistemasalud" id="sistemasalud" pattern="[a-z]{1,15}">
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

			<input type="submit" class="submitBtn" value="Crear Cliente">
		</form>
	</div>
</body>
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
 <script>
        function validarFormulario() {
            var nombre = document.getElementById("nombre").value.trim();
            var apellido = document.getElementById("apellido").value.trim();
            var rut = document.getElementById("rut").value.trim();
            var telefono = document.getElementById("telefono").value.trim();
            var afp = document.getElementById("afp").value.trim();
			var sistemasalud = document.getElementById("sistemasalud").value.trim();
			var direccion = document.getElementById("direccion").value.trim();
			var comuna = document.getElementById("comuna").value.trim();
			var edad = document.getElementById("edad").value.trim();
            
            if (nombre == "") {
                alert("Por favor, ingrese su nombre.");
                return false;
            }

            if (apellido == "") {
                alert("Por favor, ingrese su apellido.");
                return false;
            }

            if (rut == "") {
                alert("Por favor, ingrese su rut.");
                return false;
            }

            if (telefono == "") {
                alert("Por favor, ingrese su numero de telefono.");
                return false;
            }

            if (afp == "") {
                alert("Por favor, ingrese Afp en la que se encuentra.");
                return false;
            }
            
            if (sistemasalud == ""){
            	alert("por favor ingrese si se encuentra en fonasa o isapre.");
            	return false;
            }
            
            if (direccion == ""){
            	alert("Por favor, ingrese su direccion.");
            	return false;
            }

            if (comuna == ""){
            	alert("Por favor ingrese su comuna.");
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