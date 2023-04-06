package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FormularioContacto", urlPatterns = "/FormularioContacto")
public class FormularioContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("vista/contacto.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtener los valores
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String mensaje = request.getParameter("mensaje");

		// datos para ver si llegan en consola
		System.out.println(nombre);
		System.out.println(email);
		System.out.println(mensaje);

		request.setAttribute("nombre", nombre);
		request.setAttribute("email", email);
		request.setAttribute("mensaje", mensaje);

		response.sendRedirect("vista/paginas/confirmacionContacto.jsp");
		return;

	}

}
