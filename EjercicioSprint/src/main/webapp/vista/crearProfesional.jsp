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
<title>Crear Profesional</title>
<link rel="stylesheet" href="vista/assets/stylesheet.css">

</head>
<body>
<%@include file = "/FIJOS/Navbar.jsp"%>
<div class="signupFrm">
        <form action="CrearProfesional" method="POST" class="form" id="crear">
          <h1 class="title">Crear Profesional</h1>
    
          <div class="inputContainer">
            <label for="" class="label">Nombre: </label>
            <input type="text" class="input" placeholder="nombre" name="nombre" id="nombre" pattern="[A-Za-z ]{1,50}">
          </div>
    
          <div class="inputContainer">
            <label for="" class="label">Apellido: </label>
            <input type="text" class="input" placeholder="apellido" name="apellido" id="apellido" pattern="[A-Za-z ]{1,50}">
          </div>
    
          <div class="inputContainer">
            <label for="" class="label">Fecha de nacimiento: </label>
            <input type="date" class="input" name="fechaNacimiento">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Rut: </label>
            <input type="text" class="input" placeholder="11111111-1" name="rut" id="rut" pattern="[0-9]+">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Telefono: </label>
            <input type="text" class="input" placeholder="12345678" name="telefono" id="telefono" pattern="[0-9]+">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Titulo Profesional: </label>
            <input type="text" class="input" placeholder="Ingeniero, Tecnico, etc" name="tituloprof" id="tituloprof" pattern="[a-z]{1,30}">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Proyecto: </label>
            <input type="text" class="input" placeholder="Nombre del Proyecto" name="proyecto" id="proyecto" pattern="[a-z]{1,15}">
          </div>
    
    
          <input type="submit" class="submitBtn" value="Crear Profesional">
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
            var tituloprof = document.getElementById("tituloprof").value.trim();
            var proyecto = document.getElementById("proyecto").value.trim();

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

            if (telefono == ""){
            	alert("por favor, ingrese numero de telefono.");
            	return false;
            }
            
            if (tituloprof == ""){
            	alert("por favor, ingrese su titulo profesional");
            	return false;
            }
            
            if (proyecto == ""){
            	alert("por favor ingrese el proyecto");
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