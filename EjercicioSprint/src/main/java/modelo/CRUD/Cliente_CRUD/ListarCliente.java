package modelo.CRUD.Cliente_CRUD;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAO.ClienteDAO.*;

/**
 * Servlet implementation class ListarCliente
 */
//@WebServlet("/ListarCliente")
public class ListarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			System.out.println("entering try/catch sv listar Cliente");
			IClienteDAO clidao = new ImplClienteDAO();
			System.out.println("se creo la instancia clidao"); //DEBUG
//			listausuario = udao.listarTodos();	otra forma
			request.setAttribute("listausuarioscliente", clidao.listarTodos()); //listausuario	otra forma
			System.out.println("request.setAttribute de ListarCliente exitoso"); //DEBUG
			RequestDispatcher dispatcher = request.getRequestDispatcher("vista/listarCliente.jsp");
			dispatcher.forward(request, response);
			
			System.out.println("se despacho el forward de request,response");
		}catch(Exception e) {
			System.out.println(e + " LISTAR CLIENTE SERVLET");
		}	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
