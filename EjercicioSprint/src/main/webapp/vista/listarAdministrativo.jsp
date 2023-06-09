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
<title>Lista Administrativos</title>
</head>
<body>
	<h1>Lista de Administrativos</h1>
	<%@include file="/FIJOS/Navbar.jsp"%>
	<h2>Administrativos</h2>
	<table>
		<tr>
			<th>RUN</th>
			<th>Nombre </th>
			<th>Apellido</th>
			<th>Fecha de Nacimiento</th>
			<th>Email</th>
			<th>Area</th>
		</tr>
		<c:forEach items="${listausuariosadmin}" var="admin">
			<tr>
				<td>${admin.rut}</td>
				<td>${admin.nombre}</td>
				<td>${admin.apellido}</td>
				<td>${admin.fechaNacimiento}</td>
				<td>${admin.email}</td>
				<td>${admin.area}</td>
			</tr>
		</c:forEach>
	</table>

</body>
<footer>
	<%@include file="/FIJOS/Footer.jsp"%>
</footer>
</html>