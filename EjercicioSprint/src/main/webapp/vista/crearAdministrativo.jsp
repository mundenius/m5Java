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

</head>
<body>
<%@include file = "/FIJOS/Navbar.jsp"%>
<div class="signupFrm">
        <form action="CrearAdmin" method="POST" class="form">
          <h1 class="title">Crear Administrativo</h1>
    
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
            <label for="" class="label">Rut: </label>
            <input type="text" class="input" placeholder="11111111-1" name="rut">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Email: </label>
            <input type="text" class="input" placeholder="somethin@noreply.com" name="email">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Area: </label>
            <input type="text" class="input" placeholder="Finanzas, Gerencia, etc" name="area">
          </div>
    
    
          <input type="submit" class="submitBtn" value="Crear Administrativo">
        </form>
      </div>
      
</body>
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
</footer>
</html>