package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FormularioCrearCapacitacion", urlPatterns = "/FormularioCrearCapacitacion")
public class FormularioCrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 // Obtener los valores de los campos del formulario
        String nombreCap = request.getParameter("nombreCap");
        String descripcion = request.getParameter("descripcion");
        String fechaCap = request.getParameter("fecha");
        String duracionCap = request.getParameter("duracion");

        Date fecha = null;
        try {
            fecha = new SimpleDateFormat("dd-MM-yyyy").parse(fechaCap);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int duracion = Integer.parseInt(duracionCap);

        // Imprimir los valores obtenidos en la consola
        System.out.println(nombreCap);
        System.out.println(descripcion);
        System.out.println(fecha);
        System.out.println(duracion);

        // Guardar los valores en los atributos de la solicitud
        request.setAttribute("nombre", nombreCap);
        request.setAttribute("descripcion", descripcion);
        request.setAttribute("fecha", fecha);
        request.setAttribute("duracion", duracion);

    	// Redirige a una pagina de confirmacion
		 response.sendRedirect("Confirmacion.jsp");
		 return;


	}

}
