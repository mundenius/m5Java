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
<title>Editar Profesional</title>
<link rel="stylesheet" href="vista/assets/stylesheet.css">

</head>
<body>
<%@include file = "/FIJOS/Navbar.jsp"%>
<div class="signupFrm">
        <form action="EditarProfesional" method="POST" class="form">
          <h1 class="title">Editar Profesional</h1>
          
          <div class="inputContainer">
				<label for="" class="label">Ingrese el RUT del Usuario que desea editar: </label> <input type="text"
					class="input" placeholder="11111111-1" name="rut">
			</div>
          
          <div class="inputContainer">
            <label for="" class="label">Nombre: </label>
            <input type="text" class="input" placeholder="nombre" name="nombre">
          </div>
    
          <div class="inputContainer">
            <label for="" class="label">Apellido: </label>
            <input type="text" class="input" placeholder="apellido" name="apellido">
          </div>
    
          <div class="inputContainer">
            <label for="" class="label">Fecha de nacimiento: </label>
            <input type="date" class="input" name="fechaNacimiento">
          </div>
                 
          <div class="inputContainer">
            <label for="" class="label">Telefono: </label>
            <input type="text" class="input" placeholder="12345678" name="telefono">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Titulo Profesional: </label>
            <input type="text" class="input" placeholder="Ingeniero, Tecnico, etc" name="tituloprof">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Proyecto: </label>
            <input type="text" class="input" placeholder="Nombre del Proyecto" name="proyecto">
          </div>
    
    
          <input type="submit" class="submitBtn" value="Editar Profesional">
        </form>
      </div>
</body>
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
</footer>
</html>