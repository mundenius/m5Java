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
<title>Editar Administrativo</title>
<link rel="stylesheet" href="vista/assets/stylesheet.css">

</head>
<body>
<%@include file = "/FIJOS/Navbar.jsp"%>
<div class="signupFrm">
        <form action="EditarAdmin" method="POST" class="form" id="adminForm">
          <h1 class="title">Editar Administrativo</h1>


			<div class="inputContainer">
				<label for="" class="label">Ingrese el RUT del Usuario que desea editar: </label> <input type="text"
					class="input" placeholder="11111111-1" name="rut" id="rut" pattern="[0-9]+">
			</div>

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
            <label for="" class="label">Email: </label>
            <input type="text" class="input" placeholder="somethin@noreply.com" name="email" id="email" pattern="[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Area: </label>
            <input type="text" class="input" placeholder="Finanzas, Gerencia, etc" name="area" id="area" pattern="[A-Za-z ]{1,50}">
          </div>
    
    
          <input type="submit" class="submitBtn" value="Editar Administrativo">
        </form>
      </div>
</body>
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
 <script>
 // se define la funcion validarFormulario(), se encarga de validar los campos del formulario
        function validarFormulario() {
        	// obtenemos los valores de los campos del formulario
            var rut = document.getElementById("rut").value.trim();
            var nombre = document.getElementById("nombre").value.trim();
            var apellido = document.getElementById("apellido").value.trim();
            var email = document.getElementById("email").value.trim();
            var area = document.getElementById("area").value.trim();

         // se verifica si el input esta vacio, si lo esta, sale mensaje de alerta y se retorna falso
            if (rut == "") {
                alert("Por favor, ingrese rut del usuario que desea editar");
                return false;
            }
            
            if (nombre == "") {
                alert("Por favor, ingrese nombre a editar.");
                return false;
            }

            if (apellido == "") {
            	alert("Por favor, ingrese apellido a editar.");
                return false;
            }

            if (email == "") {
                alert("Por favor, ingrese su correo electrónico a editar");
                return false;
            }

            if (area == "") {
                alert("Por favor, ingrese area a editar.");
                return false;
            }

         // Si todos los campos tienen datos, retornamos verdadero
            return true;
        }

     // se asigna la funcion validarFormulario() al evento "onsubmit" del formulario con id que corresponde
        //en este caso la id es Adminform
        document.getElementById("adminForm").onsubmit = function() {
            return validarFormulario();
        };
    </script>
</footer>
</html>