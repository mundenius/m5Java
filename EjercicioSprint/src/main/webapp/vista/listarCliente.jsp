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
<title>Lista Cliente</title>

</head>
<body>
	<h1>Lista de Clientes</h1>
	<%@include file="/FIJOS/Navbar.jsp"%>
	<h2>Clientes</h2>
	<table>
		<tr>
			<th>RUN</th>
			<th>Nombre </th>
			<th>Apellido</th>
			<th>Fecha de Nacimiento</th>
			<th>Telefono</th>
			<th>AFP</th>
			<th>Sistema de Salud</th>
			<th>Direccion</th>
			<th>Comuna</th>
			<th>Edad</th>
		</tr>
		<c:forEach items="${listausuarioscliente}" var="cli">
			<tr>
				<td>${cli.rut}</td>
				<td>${cli.nombre}</td>
				<td>${cli.apellido}</td>
				<td>${cli.fechaNacimiento}</td>
				<td>${cli.telefono}</td>
				<td>${cli.afp}</td>
				<td>${cli.sistemaSalud}</td>
				<td>${cli.direccion}</td>
				<td>${cli.comuna}</td>
				<td>${cli.edad}</td>
			</tr>
		</c:forEach>
	</table>

</body>
<footer>
	<%@include file="/FIJOS/Footer.jsp"%>
</footer>
</html>