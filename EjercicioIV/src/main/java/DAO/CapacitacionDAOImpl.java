package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import clases.Capacitacion;
import conexion.Singleton;

public class CapacitacionDAOImpl implements ICapacitacionDAO{

	@Override
	public List<Capacitacion> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrar(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		System.out.println("pre getConnection");
		//se instancia una nueva conexion con el singleton
		Connection conn = Singleton.getConnection();
		System.out.println("llego la conexion= " + conn);
		try {
			System.out.println("just entered try/catch registrar PersonaDAOImpl\n");
			
			// se prepara la query para llamarla luego
			String sql = "INSERT INTO ejemplosingletondao.persona(idPersona, Nombre) values(?,?);";
//				+ "INSERT INTO persona(Nombre) values(?);";
			
			//se instancia el statement, y se manda la query que se preparo anteriormente
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, capacitacion.getId());
			st.setString(2, capacitacion.getNombre());
			System.out.println("atributos set en la query"); //DEBUG
			st.executeUpdate();
			st.close();
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e + "Registrar, Clase PersonaDAOImpl");
		}
	}

	@Override
	public void actualizar(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
