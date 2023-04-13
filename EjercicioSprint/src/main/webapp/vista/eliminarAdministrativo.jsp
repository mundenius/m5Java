<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar Administrativo</title>
</head>
<body>
<%@include file = "/FIJOS/Navbar.jsp"%>

<div class="signupFrm">
		<form action="EliminarAdmin" method="POST" class="form" onsubmit="return validarFormulario();">

			<h1 class="title">Eliminar Administrativo</h1>
			
			<div class="inputContainer">
				<label for="" class="label">Ingrese el RUT del Administrativo que desea eliminar: </label> <input type="text"
					class="input" placeholder="11111111-1" name="rutadmin" id="rutadmin" pattern="[0-9]+">
			</div>
						<input type="submit" class="submitBtn" value="Eliminar Cliente">
		</form>
	</div>
	
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
<script>
function validarFormulario() {
    var rut = document.getElementById("rutadmin").value.trim();
    
    if (rut == "") {
        alert("Por favor, ingrese el RUT del Administrativo.");
        return false;
    }

    return true;
}
</script>
</footer>
</body>
</html>