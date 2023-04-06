<%-- autores:
Javiera Saavedra
Valentina Saldias
Adrian Fredes 
Carlos Carrasco --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
	<link rel="stylesheet" href="assets/stylesheet.css">
<title>Usuario creado</title>
<link rel="stylesheet" href="/vista/assets/stylesheet.css">
   
    
    </head>
    <body>
    	<header>
		<%@include file= "/FIJOS/Header.jsp" %>
	</header>
	<nav>
	
	<%@include file= "/FIJOS/Navbar.jsp" %>
        <div class="container">
            <h1>¡Usuario creado con éxito!</h1>
            <p>.</p>
    
    
    		<a href="ListarUsuario" class="btn">Ir a lista de usuarios</a>
            <a href="inicio.jsp" class="btn">Regresar al inicio</a>
        </div>
    </body>
    <footer>
<%@include file= "/FIJOS/Footer.jsp" %>
</footer>
    </html>