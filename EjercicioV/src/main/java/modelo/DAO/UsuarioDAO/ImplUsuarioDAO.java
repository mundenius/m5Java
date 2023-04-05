package modelo.DAO.UsuarioDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import modelo.clases.Usuario;
import modelo.conexion.Singleton;



public class ImplUsuarioDAO implements IUsuarioDAO{

	ResultSet rs;
	Statement st;

	@Override
	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		//se instancia una nueva conexion con el singleton
		Connection conn = Singleton.getConnection();
		System.out.println("llegó la conexion.. " + conn); //debug
		// TODO Auto-generated method stub
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			String sql = "SELECT * FROM usuario ORDER by idusuario";
			PreparedStatement st = conn.prepareStatement(sql);
			rs = st.executeQuery(sql);
			System.out.println("query ejecutada");
			while(rs.next()) {
				Usuario us = new Usuario();
				us.setIdUsuario(String.valueOf(rs.getInt(1))); // el numero es por la columna en la base de datos
				us.setFechaCap(String.valueOf(rs.getDate(2)));
				us.setHora(String.valueOf(rs.getTime(3)));
				us.setLugar(rs.getString(4));
				us.setDuracionCap(String.valueOf(rs.getInt(5)));
				us.setCliente_rutcliente(rs.getInt(6));
				lista.add(us);
				System.out.println("Capacitacion creada");
			}
			System.out.println("saliendo try/catch listarTodos()");
		}catch(Exception e) {
			System.out.println(e + " LISTAR, CAPACITACION DAO IMPL");
		}finally {
			try {
				st.close();
				rs.close();
				conn.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
		return lista;
	}

	@Override
	public void registrar(Usuario d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Usuario d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

}
