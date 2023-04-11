<%-- autores:
Javiera Saavedra
Valentina Saldias
Adrian Fredes 
Carlos Carrasco --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/vista/assets/stylesheet.css">
<title>Lista Profesionales</title>
</head>
<body>
	<h1>Lista de Profesionales</h1>
	<%@include file="/FIJOS/Navbar.jsp"%>
	<h2>Profesionales</h2>
	<table>
		<tr>
			<th>RUN</th>
			<th>Nombre </th>
			<th>Apellido</th>
			<th>Fecha de Nacimiento</th>
			<th>Telefono</th>
			<th>Titulo Profesional</th>
			<th>Proyecto</th>
		</tr>
		<c:forEach items="${listausuariosprof}" var="prof">
			<tr>
				<td>${prof.rut}</td>
				<td>${prof.nombre}</td>
				<td>${prof.apellido}</td>
				<td>${prof.fechaNacimiento}</td>
				<td>${prof.telefono}</td>
				<td>${prof.tituloProfesional}</td>
				<td>${prof.proyecto}</td>
			</tr>
		</c:forEach>
	</table>

</body>
<footer>
	<%@include file="/FIJOS/Footer.jsp"%>
</footer>
</html>