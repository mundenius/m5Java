package modelo.CRUD.Cliente_CRUD;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAO.ClienteDAO.*;
import modelo.clases.Cliente;

/**
 * Servlet implementation class EliminarCliente
 */
//@WebServlet("/EliminarCliente")
public class EliminarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("vista/eliminarCliente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rutcliente = request.getParameter("rut");
		System.out.println(rutcliente);
		
		try {
			System.out.println("entering try/catch ELIMINAR CLIENTE SERVLET");
			Cliente cli = new Cliente();
			ImplClienteDAO clidao = new ImplClienteDAO();
			
			request.setAttribute("rutcliente", rutcliente);
			cli.setRut(Long.parseLong(rutcliente));
			System.out.println("RUT set en instancia cli\nllamado a metodo eliminar de clidao...");
			
			clidao.eliminar(cli);
	
			response.sendRedirect("ConfirmacionEliminarCliente"); 
		}catch(Exception e) {
			System.out.println(e + " SERVLET ELIMINAR CLIENTE");
		}
	}

}
