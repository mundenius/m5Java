 <link rel="stylesheet" href="assets/stylesheet.css">
 <nav class="navbar navbar-expand-sm navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#opciones">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    
    <a class="navbar-brand"
    href="${pageContext.request.contextPath}/inicio.jsp">Prevención
    de Riesgo</a>
    
    
    <div class="collapse navbar-collapse" id="opciones">   
      <ul class="navbar-nav">
        <li class="nav-item"><a class="nav-link" aria-current="page"
            href="${pageContext.request.contextPath}/inicio.jsp">Inicio</a></li>
            <li class="nav-item"><a class="nav-link"
                href="${pageContext.request.contextPath}/contacto.jsp">Contacto</a>
            </li>
            <li class="nav-item"><a class="nav-link"
                href="${pageContext.request.contextPath}/capacitacion.jsp">Capacitación</a>
            </li>
            <li class="nav-item"><a class="nav-link"
                href="${pageContext.request.contextPath}/listaCapacitaciones.jsp">Lista
                    de Capacitaciones</a></li>  
                    <%
                    if (request.getSession().getAttribute("nombre") != null) {
                    %>
                    <li class="nav-item"><a class="nav-link"
                        href="${pageContext.request.contextPath}/CerrarSesion">Cerrar Sesión</a></li>
      </ul>
    </div>
  </nav>

				<%-- <li class="dropdown">
					<button class="btn btn-secondary dropdown-toggle" type="button"
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Menú <% %></button>
					<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
						<a class="dropdown-item" type="button">Editar
							Usuario</a>
						<a class="dropdown-item" type="button" href="${pageContext.request.contextPath}/Login">Cerrar Sesión</a>
					</div>
				</li> --%>
				<%-- 				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" role="button"
					data-bs-toggle="dropdown" aria-expanded="false"> Menú Usuario </a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="#">Configuración</a></li>
						<li><a class="dropdown-item"
							href="${pageContext.request.contextPath}/index.jsp">Cerrar
								Sesión</a></li>
					</ul></li> --%>

				<%
				} else {
				%>

			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/index.jsp">Login</a></li>

				<%
				}
				%>
			</ul>
		</div>
	</div>

</nav>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>  