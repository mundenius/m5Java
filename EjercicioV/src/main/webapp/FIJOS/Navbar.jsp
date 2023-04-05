<nav class="navbar navbar-expand-sm navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#opciones">
      <span class="navbar-toggler-icon"></span>
    </button>
		<a class="navbar-brand"
			href="/inicio.jsp">Prevencion
			de Riesgo</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="inicio.jsp">Inicio</a></li>
				<li class="nav-item"><a class="nav-link"
					href="vista/contacto.jsp">Contacto</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="vista/capacitacion.jsp">Capacitacion</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="ListarCapacitacion">Lista
						de Capacitaciones</a></li>


				<%
				if (request.getSession().getAttribute("nombre") != null) {
				%>
				<li class="nav-item"><a class="nav-link"
					href="CerrarSesion">Cerrar Sesion</a></li>
				<%-- <li class="dropdown">
					<button class="btn btn-secondary dropdown-toggle" type="button"
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Men� <% %></button>
					<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
						<a class="dropdown-item" type="button">Editar
							Usuario</a>
						<a class="dropdown-item" type="button" href="${pageContext.request.contextPath}/Login">Cerrar Sesi�n</a>
					</div>
				</li> --%>
				<%-- 				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" role="button"
					data-bs-toggle="dropdown" aria-expanded="false"> Men� Usuario </a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="#">Configuraci�n</a></li>
						<li><a class="dropdown-item"
							href="${pageContext.request.contextPath}/index.jsp">Cerrar
								Sesi�n</a></li>
					</ul></li> --%>

				<%
				} else {
				%>

			<li class="nav-item"><a class="nav-link"
				href="/index.jsp">Login</a></li>

				<%
				}
				%>
			</ul>
		</div>

</nav>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>  

