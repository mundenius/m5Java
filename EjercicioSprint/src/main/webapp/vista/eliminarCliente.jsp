<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar Cliente</title>

</head>
<body>
<%@include file = "/FIJOS/Navbar.jsp"%>

<div class="signupFrm">
		<form action="EliminarCliente" method="POST" class="form" onsubmit="return validarFormulario();">
			<h1 class="title">Eliminar Cliente</h1>
			
			<div class="inputContainer">
				<label for="" class="label">Ingrese el RUT del Cliente que desea eliminar: </label> 
				<input type="text" class="input" placeholder="11111111-1" name="rut" id="rutcliente" pattern="[0-9]+">
			</div>
						<input type="submit" class="submitBtn" value="Eliminar Cliente">
		</form>
	</div>
	
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>

</footer>
<script>
function validarFormulario() {
    var rut = document.getElementById("rutcliente").value.trim();
    
    if (rut == "") {
        alert("Por favor, ingrese el RUT del cliente.");
        return false;
    }

    return true;
}
</script>
</body>
</html>
