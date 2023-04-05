<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="assets/crearUsuarioStyle.css">
<title>Crear Usuario</title>
</head>
<body>
<header>
<%@include file= "/FIJOS/Header.jsp" %>
</header>
<nav>
	<%@include file= "/FIJOS/Navbar.jsp" %>
</nav>
    <div class="signupFrm">
        <form action="" class="form">
          <h1 class="title">Crear usuario</h1>
    
          <div class="inputContainer">
            <input type="text" class="input" placeholder="a">
            <label for="" class="label">Id Usuario: </label>
          </div>
    
          <div class="inputContainer">
            <input type="text" class="input" placeholder="a">
            <label for="" class="label">Nombre: </label>
          </div>
    
          <div class="inputContainer">
            <input type="text" class="input" placeholder="a">
            <label for="" class="label">Apellido: </label>
          </div>
    
          <div class="inputContainer">
            <input type="date" class="input" placeholder="a">
            <label for="" class="label">Fecha de nacimiento: </label>
          </div>
          
          <div class="inputContainer">
            <input type="text" class="input" placeholder="a">
            <label for="" class="label">Rut: </label>
          </div>
    
    
          <input type="submit" class="submitBtn" value="Sign up">
        </form>
      </div>
</body>
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
</footer>
</html>