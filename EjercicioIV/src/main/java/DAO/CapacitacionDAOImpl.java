package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.util.List;
import java.util.ArrayList;

import clases.Capacitacion;
import conexion.Singleton;

public class CapacitacionDAOImpl implements ICapacitacionDAO{

	ResultSet rs;
	Statement st;
	@Override
	public List<Capacitacion> listarTodos() {
		// TODO Auto-generated method stub
		//se instancia una nueva conexion con el singleton
				Connection conn = Singleton.getConnection();
				System.out.println("llegó la conexion.. " + conn); //debug
				// TODO Auto-generated method stub
				List<Capacitacion> lista = new ArrayList<Capacitacion>();
				try {
					String sql = "SELECT * FROM capacitaciones ORDER by idcapacitacion";
					PreparedStatement st = conn.prepareStatement(sql);
					rs = st.executeQuery(sql);
					System.out.println("query ejecutada");
					while(rs.next()) {
						Capacitacion cap = new Capacitacion();
						cap.setIdCapacitacion(String.valueOf(rs.getInt(1))); // el numero es por la columna en la base de datos
						cap.setFechaCap(String.valueOf(rs.getDate(2)));
						cap.setHora(String.valueOf(rs.getTime(3)));
						cap.setLugar(rs.getString(4));
						cap.setDuracionCap(String.valueOf(rs.getInt(5)));
						cap.setCliente_rutcliente(rs.getInt(6));
						lista.add(cap);
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
	public void registrar(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		System.out.println("pre getConnection");
		//se instancia una nueva conexion con el singleton
		Connection conn = Singleton.getConnection();
		System.out.println("llego la conexion= " + conn);
		try {
			System.out.println("just entered try/catch REGISTRAR CAPACITACION IMPL\n");
			
			// se prepara la query para llamarla luego
			String sql = "INSERT INTO asesoriaprevriesgos.capacitaciones(idcapacitacion, capfecha, caphora, caplugar, capduracion, cliente_rutcliente) values(?,?,?,?,?,?);";
//				+ "INSERT INTO persona(Nombre) values(?);";
			
			//se instancia el statement, y se manda la query que se preparo anteriormente
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, Integer.parseInt(capacitacion.getIdCapacitacion()));
			st.setDate(2, StringToDate(capacitacion.getFechaCap()));
			st.setTime(3, Time.valueOf(capacitacion.getHora()) );
			st.setString(4, capacitacion.getLugar());
			st.setInt(5, Integer.parseInt(capacitacion.getDuracionCap()));
			st.setInt(6, capacitacion.getCliente_rutcliente());
			System.out.println("atributos set en la query"); //DEBUG
			st.executeUpdate();
			st.close();
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e + "REGISTRAR, CAPACITACION IMPL");
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

	public static Date StringToDate(String fecha) {
		Date date = Date.valueOf(fecha);
		return date;
	}
}
