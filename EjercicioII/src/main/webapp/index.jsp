<%-- pagina index donde se despliega el login --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
#popup {
	position: fixed;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 300px;
	padding: 20px;
	background-color: #ffffff;
	border: 1px solid #cccccc;
	border-radius: 5px;
	box-shadow: 0px 0px 10px #cccccc;
}
</style>

<script>
function datosInvalidos() {
  var username = document.getElementsByName("usuario")[0].value;
  var password = document.getElementsByName("pass")[0].value;

  // Hacer una solicitud a su archivo de backend para validar las credenciales
  // Si las credenciales son inválidas, mostrar la ventana emergente
  if (credentialsAreInvalid) {
    document.getElementById("popup").style.display = "block";
  }
}
</script>

</head>
<body>
	<div class="body"></div>
	<div class="grad"></div>
	<div class="header">
		<div>
			Site<span>Random</span>
		</div>
	</div>
	<br>
	<div class="login">
		<input type="text" placeholder="username" name="usuario"><br>
		<input type="password" placeholder="password" name="pass"><br>
		<input type="button" value="Login" onclick="daotsInvalidos()">
	</div>

	<%-- ventana emergente en caso de error --%>
	<div id="popup" style="display: none">
		<p>El usuario o la contraseña son incorrectos. Inténtelo de nuevo.</p>
	</div>

</body>
</html>
