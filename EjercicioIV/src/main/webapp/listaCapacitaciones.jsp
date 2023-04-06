
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
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<link rel="stylesheet" href="assets/stylesheet.css">
<title>Lista Capacitaciones</title>
</head>
<body>
	<h1>Lista de Capacitaciones</h1>
	<%@include file="FIJOS/Navbar.jsp"%>
	<h2>Capacitaciones</h2>
	<table>
		<tr>
			<th>ID Capacitacion</th>
			<th>Fecha Capacitacion</th>
			<th>Hora Capacitacion</th>
			<th>Lugar Capacitacion</th>
			<th>Duracion Capacitacion</th>
			<th>Rut Cliente </th>
		</tr>
		<c:forEach items="${listacapacitacion}" var="cap">
			<tr>
				<td>${cap.idCapacitacion}</td>
				<td>${cap.fechaCap}</td>
				<td>${cap.hora}</td>
				<td>${cap.lugar}</td>
				<td>${cap.duracionCap}</td>
				<td>${cap.cliente_rutcliente}</td>
			</tr>
		</c:forEach>
	</table>

</body>
<footer>
	<%@include file="FIJOS/Footer.jsp"%>
</footer>
</html>