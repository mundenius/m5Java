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
<title>Ingrese capacitacion</title>
<link rel="stylesheet" href="assets/stylesheet.css">

</head>
<body>

	<header>
		<h1>Crear Capacitación</h1>
	</header>


	<main>
		<form action="FormularioCrearCapacitacion" method="POST"  onsubmit="return validarDuracion()">
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