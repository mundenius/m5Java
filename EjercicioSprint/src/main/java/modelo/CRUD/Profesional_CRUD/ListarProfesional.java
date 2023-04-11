package modelo.CRUD.Profesional_CRUD;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAO.ProfesionalDAO.*;

/**
 * Servlet implementation class ListarProfesional
 */
//@WebServlet("/ListarProfesional")
public class ListarProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarProfesional() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			System.out.println("entering try/catch sv listar Profesional");
			IProfesionalDAO profdao = new ImplProfesionalDAO();
			System.out.println("se creo la instancia profdao"); //DEBUG
//			listausuario = udao.listarTodos();	otra forma
			request.setAttribute("listausuariosprof", profdao.listarTodos()); //listausuario	otra forma
			System.out.println("request.setAttribute de ListarProfesional exitoso"); //DEBUG
			RequestDispatcher dispatcher = request.getRequestDispatcher("vista/listarProfesional.jsp");
			dispatcher.forward(request, response);
			
			System.out.println("se despacho el forward de request,response");
		}catch(Exception e) {
			System.out.println(e + " LISTAR PROFESIONAL SERVLET");
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
