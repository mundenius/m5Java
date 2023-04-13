package modelo.CRUD.Admin_CRUD;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAO.AdminDAO.*;
import modelo.clases.Administrativo;

/**
 * Servlet implementation class EliminarAdmin
 */
//@WebServlet("/EliminarAdmin")
public class EliminarAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("vista/eliminarAdministrativo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rutadmin = request.getParameter("rutadmin");
		System.out.println(rutadmin);
		
		try {
			System.out.println("entering try/catch ELIMINAR ADMIN SERVLET");
			Administrativo admin = new Administrativo();
			ImplAdminDAO admindao = new ImplAdminDAO();
			
			request.setAttribute("rutadmin", rutadmin);
			admin.setRut(Long.parseLong(rutadmin));
			System.out.println("RUT set en instancia admin\nllamado a metodo eliminar de admindao...");
			
			admindao.eliminar(admin);
	
			response.sendRedirect("ConfirmacionEliminarAdmin"); 

		}catch(Exception e) {
			System.out.println(e + " SERVLET ELIMINAR ADMINISTRATIVO");
		}
	}

}
