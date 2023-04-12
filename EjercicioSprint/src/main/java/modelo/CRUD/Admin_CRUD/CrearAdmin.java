package modelo.CRUD.Admin_CRUD;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAO.AdminDAO.*;
import modelo.clases.Administrativo;

/**
 * Servlet implementation class CrearAdmin
 */
//@WebServlet("/CrearAdmin")
public class CrearAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("vista/crearAdministrativo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Obtener los valores de los campos del formulario

		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String fechaNacimiento = request.getParameter("fechaNacimiento"); 
		String rut = request.getParameter("rut"); 
		String email = request.getParameter("email");
		String area = request.getParameter("area");
		

		Date fecha= null;
		if (fechaNacimiento != null && !fechaNacimiento.isEmpty()) {
		    try {
		        fecha = new SimpleDateFormat("dd-MM-yyyy").parse(fechaNacimiento);
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		}

					
		// Imprimir los valores obtenidos en la consola
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(fecha);
		System.out.println(rut);
		System.out.println(email);
		System.out.println(area);
		// Guardar los valores en los atributos de la solicitud

		try {
			System.out.println("entering try/catch CREAR ADMIN SERVLET");
			Administrativo admin = new Administrativo();
			ImplAdminDAO admindao = new ImplAdminDAO();
			
			request.setAttribute("nombre", nombre);
			admin.setNombre(nombre);
			request.setAttribute("apellido", apellido);
			admin.setApellido(apellido);
			request.setAttribute("fecha nacimiento", fechaNacimiento);
			admin.setFechaNacimiento(fechaNacimiento);
			request.setAttribute("rut", rut);
			admin.setRut(Long.parseLong(rut));
			request.setAttribute("email", email);
			admin.setEmail(email);
			request.setAttribute("area", area);
			admin.setArea(area);

			
			admindao.registrar(admin);
			// Redirige a una pagina de confirmacion
			response.sendRedirect("ConfirmacionCreacionAdmin"); 
			
		}catch(Exception e) {
			System.out.println(e + " SERVLET CREAR ADMINISTRATIVO");
		}
	}

}
