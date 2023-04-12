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
<title>Crear Administrativo</title>
<link rel="stylesheet" href="vista/assets/stylesheet.css">
<script>

	// se instancian en html con id
  const form = document.getElementById('adminForm');
  const nombreInput = document.getElementById('nombre');
  const apellidoInput = document.getElementById('apellido');
  const rutInput = document.getElementById('rut');
  const emailInput = document.getElementById('email');
  const areaInput = document.getElementById('area');

  form.addEventListener('submit', function(event) {

	  
	 //validaciones, si no se cumplen se detiene envio de formulario usando metodo event.preventDefault().
    if (!/^[a-zA-Z]+$/.test(nombreInput.value)) {
      alert('ingrese solo letras');
      event.preventDefault();
    }

    if (!/^[a-zA-Z]+$/.test(apellidoInput.value)) {
      alert('ingrese solo letras');
      event.preventDefault();
    }

    if (!/^[0-9]+$/.test(rutInput.value)) {
      alert('ingrese solo numeros');
      event.preventDefault();
    }

    if (!/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/.test(emailInput.value)) {
      alert('ingrese una dirección de correo valido');
      event.preventDefault();
    }

    if (!/^[a-zA-Z]+$/.test(areaInput.value)) {
      alert('ingrese solo letras');
      event.preventDefault();
    }
  });
</script>

</head>
<body>
<%@include file = "/FIJOS/Navbar.jsp"%>
<div class="signupFrm">
  <form action="CrearAdmin" method="POST" class="form" id="adminForm">
    <h1 class="title">Crear Administrativo</h1>

    <div class="inputContainer">
      <label for="nombre" class="label">Nombre: </label>
      <input type="text" class="input" placeholder="nombre" name="nombre" id="nombre">
    </div>

    <div class="inputContainer">
      <label for="apellido" class="label">Apellido: </label>
      <input type="text" class="input" placeholder="apellido" name="apellido" id="apellido">
    </div>

    <div class="inputContainer">
      <label for="fechaNacimiento" class="label">Fecha de nacimiento: </label>
      <input type="date" class="input" name="fechaNacimiento">
    </div>

    <div class="inputContainer">
      <label for="rut" class="label">Rut: </label>
      <input type="text" class="input" placeholder="11111111-1" name="rut" id="rut">
    </div>

    <div class="inputContainer">
      <label for="email" class="label">Email: </label>
      <input type="text" class="input" placeholder="somethin@noreply.com" name="email" id="email">
    </div>

    <div class="inputContainer">
      <label for="area" class="label">Area: </label>
      <input type="text" class="input" placeholder="Finanzas, Gerencia, etc" name="area" id="area">
    </div>

    <input type="submit" class="submitBtn" value="Crear Administrativo">
  </form>
</div>

      
</body>
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
</footer>
</html>