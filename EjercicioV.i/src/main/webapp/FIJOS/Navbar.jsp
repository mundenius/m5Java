 <nav class="navbar navbar-expand-sm navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#opciones">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    <!-- logo -->
    <a class="navbar-brand"
    href="/inicio.jsp">Prevención
    de Riesgo</a>
    
    <!-- enlaces -->
    <div class="collapse navbar-collapse" id="opciones">   
      <ul class="navbar-nav">
        <li class="nav-item"><a class="nav-link" aria-current="page"
            href="inicio.jsp">Inicio</a></li>
            <li class="nav-item"><a class="nav-link"
                href="contacto.jsp">Contacto</a>
            </li>
            <li class="nav-item"><a class="nav-link"
                href="capacitacion.jsp">Capacitación</a>
            </li>
            <li class="nav-item"><a class="nav-link"
                href="listaCapacitaciones.jsp">Lista
                    de Capacitaciones</a></li>  
                    <li class="nav-item"><a class="nav-link"
                      href="usuario.jsp">Crear Usuario</a></li>
				<li class="nav-item"><a class="nav-link"
					href="listaUsuario.jsp">Lista de Usuarios</a></li>		


				<%
				if (request.getSession().getAttribute("nombre") != null) {
				%>
				<li class="nav-item"><a class="nav-link"
					href="CerrarSesion">Cerrar Sesion</a></li>
				<%-- <li class="dropdown">
					<button class="btn btn-secondary dropdown-toggle" type="button"
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Menï¿½ <% %></button>
					<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
						<a class="dropdown-item" type="button">Editar
							Usuario</a>
						<a class="dropdown-item" type="button" href="${pageContext.request.contextPath}/Login">Cerrar Sesiï¿½n</a>
					</div>
				</li> --%>
				<%-- 				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" role="button"
					data-bs-toggle="dropdown" aria-expanded="false"> Menï¿½ Usuario </a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="#">Configuraciï¿½n</a></li>
						<li><a class="dropdown-item"
							href="${pageContext.request.contextPath}/index.jsp">Cerrar
								Sesiï¿½n</a></li>
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

