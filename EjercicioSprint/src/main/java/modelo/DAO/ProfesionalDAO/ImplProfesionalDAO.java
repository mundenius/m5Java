package modelo.DAO.ProfesionalDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

import modelo.clases.Profesional;
import modelo.conexion.Singleton;

public class ImplProfesionalDAO implements IProfesionalDAO{

	@Override
	public List<Profesional> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrar(Profesional prof) {
		System.out.println("pre getConnection");
		//se instancia una nueva conexion con el singleton
		 Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch REGISTRAR PROFESIONAL IMPL\n");
		        String sql = "INSERT INTO usuario(nombre, apellido, fechaNacimiento, run) VALUES (?, ?, ?, ?);";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setString(2, prof.getNombre());
		        st.setString(3, prof.getApellido());
		        st.setDate(4, StringToDate(prof.getFechaNacimiento()));
		        st.setLong(5, prof.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query insertar USUARIO \nProsigue insertar datos de administrativo"); //DEBUG
		        
		        String sqlprof = "INSERT INTO profesional(telefono, tituloprofesional,proyecto, rutprof) VALUES (?,?,?,?);";
		        PreparedStatement stmt = conn.prepareStatement(sqlprof);
		        stmt.setInt(1, prof.getTelefono());
		        stmt.setString(2, prof.getTituloProfesional());
		        stmt.setString(2, prof.getProyecto());
		        stmt.setLong(4, prof.getRut());

		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para PROFESIONAL");
		        
		        st.close();
		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al registrar PROFESIONAL: " + e.getMessage());
		    }
		
	}

	@Override
	public void actualizar(Profesional prof) {
		System.out.println("pre getConnection");
		//se instancia una nueva conexion con el singleton
		 Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch ACTUALIZAR PROFESIONAL IMPL\n");
		        String sql = "UPDATE usuario set nombre = ?, apellido = ?, fechaNacimiento = ? WHERE run = ?;";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setString(1, prof.getNombre());
		        st.setString(2, prof.getApellido());
		        st.setDate(3, StringToDate(prof.getFechaNacimiento()));
		        st.setLong(4, prof.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query actualizar USUARIO \nProsigue insertar datos de profesional"); //DEBUG
		        
		        String sqlprof = "UPDATE administrativo set telefono = ?, tituloprofesional = ?, proyecto = ? WHERE rutprof = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqlprof);
		        stmt.setInt(1, prof.getTelefono());
		        stmt.setString(2, prof.getTituloProfesional());
		        stmt.setString(3, prof.getProyecto());
		        stmt.setLong(4, prof.getRut());
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para PROFESIONAL");
		        
		        st.close();
		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al actualizar PROFESIONAL: " + e.getMessage());
		    }
		
	}

	@Override
	public void eliminar(Profesional prof) {
		Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch ELIMINAR PROFESIONAL IMPL\n");
		        String sql = "DELETE FROM profesional WHERE run = ?;";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setLong(1, prof.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query eliminar PROFESIONAL \nProsigue eliminacion de datos USUARIO"); //DEBUG
		        
		        String sqlprof = "DELETE FROM usuario WHERE run = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqlprof);
		        stmt.setInt(1, prof.getIdProfesional());
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para USUARIO");
		        
		        st.close();
		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al eliminar PROFESIONAL: " + e.getMessage());
		    }
		
	}

	public static Date StringToDate(String fecha) {
		Date date = Date.valueOf(fecha);
		return date;
	}
}
