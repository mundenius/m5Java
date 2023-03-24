package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/formularioContacto")
public class FormularioContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public FormularioContacto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtener los valores de los campos del formulario
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String mensaje = request.getParameter("mensaje");


		request.setAttribute("nombre", nombre);
		request.setAttribute("email", email);
		request.setAttribute("mensaje", mensaje);

		// Redirige a una pagina de confirmacion
		response.sendRedirect("/Confirmacion.jsp");

	}

}
