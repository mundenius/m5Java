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
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<title>Ingrese capacitacion</title>
<link rel="stylesheet" href="assets/stylesheet.css">

</head>
<body>

	<header>
		<h1>Crear Capacitación</h1>
	</header>
	<%@include file = "FIJOS/Navbar.jsp"%>


	<main>
		<form action="CrearCapacitacion" method="POST"  onsubmit="return validarDuracion()">
			<label for="idCapacitacion"><strong>ID Capacitación:</strong></label>
			<input type="text" id="idcapacitacion" name="idCapacitacion" required 
			oninvalid="this.setCustomValidity('Ingrese un numero de ID')"
			onchange="this.setCustomValidity('')" type="text" /><br><br>
			
			<label for="cliente_rutcliente"><strong>RUT Cliente:</strong></label>
			<input type="text" id="cliente_rutcliente" name="cliente_rutcliente"  required 
			oninvalid="this.setCustomValidity('Ingrese Rut')"
			onchange="this.setCustomValidity('')" type="text" /><br><br>
			
			<label for="lugar"><strong>Lugar:</strong></label>
			<input type="text" id="lugar" name="lugar"  required 
			oninvalid="this.setCustomValidity('Ingrese una dirección para la capacitación')"
			onchange="this.setCustomValidity('')" type="text"/><br><br>

			<label for="fecha"><strong>Fecha:</strong></label> 
			<input type="date" id="fecha" name="fecha" required><br><br> 
			
			<label for="hora"><strong>Hora:</strong></label>
			<input type="time" id="hora" name="hora" required><br><br>

			<label for="duracion"><strong>Duración (en minutos):</strong></label>  
			<input type="number" id="duracion" name="duracion" required><br><br>
			
			

			<script>
				const duracionInput = document.getElementById('duracion');
				duracionInput
						.addEventListener(
								'change',
								function() {

									const duracionValue = parseInt(duracionInput.value);

									// Si el valor es menor o igual a 15, alertta
									if (duracionValue <= 15) {
										alert('La capacitacion no puede durar menos de 15 minutos');
										duracionInput.value = 15;
									}
								});
			</script>


			<input type="submit" value="enviar">
		</form>
	</main>

</body>
<footer>
<%@include file= "FIJOS/Footer.jsp" %>
</footer>
</html>