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
		return null;
	}

	@Override
	public void registrar(Usuario usuario) {
		// TODO Auto-generated method stub
		System.out.println("pre getConnection");
		//se instancia una nueva conexion con el singleton
		 Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch REGISTRAR USUARIO IMPL\n");
		        String sql = "INSERT INTO usuarios(idUsuario, nombre, apellido, fechaNacimiento, rut) VALUES (?, ?, ?, ?, ?)";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setInt(1, usuario.getIdUsuario());
		        st.setString(2, usuario.getNombre());
		        st.setString(3, usuario.getApellido());
		        st.setDate(4, StringToDate(usuario.getFechaNacimiento()));
		        st.setLong(5, usuario.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query"); //DEBUG
		        st.close();
		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al registrar usuario: " + e.getMessage());
		    }
	}

	@Override
	public void actualizar(Usuario d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}
	
	public static Date StringToDate(String fecha) {
		Date date = Date.valueOf(fecha);
		return date;
	}

}
