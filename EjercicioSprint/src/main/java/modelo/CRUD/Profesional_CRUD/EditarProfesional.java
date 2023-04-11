package modelo.CRUD.Profesional_CRUD;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAO.ProfesionalDAO.ImplProfesionalDAO;
import modelo.clases.Profesional;

/**
 * Servlet implementation class EditarProfesional
 */
//@WebServlet("/EditarProfesional")
public class EditarProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarProfesional() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("vista/editarProfesional.jsp").forward(request, response);
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
		String telefono = request.getParameter("telefono");
		String tituloProfesional = request.getParameter("tituloprof");
		String proyecto = request.getParameter("proyecto");

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
		System.out.println(telefono);
		System.out.println(tituloProfesional);
		System.out.println(proyecto);
		// Guardar los valores en los atributos de la solicitud

		try {
			System.out.println("entering try/catch EDITAR PROFESIONAL SERVLET");
			Profesional prof = new Profesional();
			ImplProfesionalDAO profdao = new ImplProfesionalDAO();
			
			request.setAttribute("nombre", nombre);
			prof.setNombre(nombre);
			request.setAttribute("apellido", apellido);
			prof.setApellido(apellido);
			request.setAttribute("fecha nacimiento", fechaNacimiento);
			prof.setFechaNacimiento(fechaNacimiento);
//			request.setAttribute("rut", rut);
//			prof.setRut(Long.parseLong(rut));
			request.setAttribute("telefono", telefono);
			prof.setTelefono(Integer.parseInt(telefono));
			request.setAttribute("area", tituloProfesional);
			prof.setTituloProfesional(tituloProfesional);
			request.setAttribute("proyecto", proyecto);
			prof.setProyecto(proyecto);
			
			profdao.actualizar(prof);
			// Redirige a una pagina de confirmacion
			response.sendRedirect("ConfirmacionEditarProfesional"); 
			
		}catch(Exception e) {
			System.out.println(e + " SERVLET EDITAR PROFESIONAL");
		}
	}

}
