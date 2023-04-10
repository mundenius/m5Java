package modelo.CRUD.Profesional_CRUD;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.clases.Profesional;
import modelo.DAO.ProfesionalDAO.*;

/**
 * Servlet implementation class EliminarProfesional
 */
//@WebServlet("/EliminarProfesional")
public class EliminarProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarProfesional() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("vista/eliminarProfesional.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rutcliente = request.getParameter("rutcliente");
		System.out.println(rutcliente);
		
		try {
			System.out.println("entering try/catch ELIMINAR PROFESIONAL SERVLET");
			Profesional prof = new Profesional();
			ImplProfesionalDAO profdao = new ImplProfesionalDAO();
			
			request.setAttribute("rutcliente", rutcliente);
			prof.setRut(Long.parseLong(rutcliente));
			System.out.println("RUT set en instancia prof\nllamado a metodo eliminar de profdao...");
			
			profdao.eliminar(prof);
	
		}catch(Exception e) {
			System.out.println(e + " SERVLET ELIMINAR PROFESIONAL");
		}
	}

}
