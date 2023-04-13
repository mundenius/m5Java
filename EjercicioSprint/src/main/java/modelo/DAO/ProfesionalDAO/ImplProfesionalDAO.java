package modelo.DAO.ProfesionalDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.clases.Profesional;
import modelo.clases.Profesional;
import modelo.conexion.Singleton;

public class ImplProfesionalDAO implements IProfesionalDAO{

	ResultSet rs;
	Statement st;
	
	@Override
	public List<Profesional> listarTodos() {
		// TODO Auto-generated method stub
		// se instancia una nueva conexion con el singleton a la base de datos
				Connection conn = Singleton.getConnection();
				System.out.println("llegó la conexion.. " + conn); // debug
				// TODO Auto-generated method stub
				List<Profesional> lista = new ArrayList<Profesional>();
				/**SE CREA UNA LISTA PARA ALMACENAR OBJETOS QUE SE TRAERAN DE LA BASE DE DATOS
				 * SE CREA UN ATRIBUTO QUE CONTIENE LA SENTENCIA SELECT PARA LA BASE DE DATOS
				 * SE PREPRARA EL STATEMENT, Y SE EJECUTA
				 * EL RESULSET GENERARA RESULTADOS, LOS CUALES SE CAPTURARAN EN EL WHILE LOOP
				 * POR CADA VEZ QUE SE EJECUTE EL WHILE LOOP, SE CREARA UN NUEVO OBJETO DE LO QUE SE ESTA LISTANDO
				 * FINALMENTE SE AGREGA CADA OBJETO A LA LISTA DE OBJETOS
				 *  */
				try {
					String sql = "SELECT usuario.run, usuario.nombre, usuario.apellido, usuario.fechanacimiento, profesional.telefono, profesional.tituloprofesional, profesional.proyecto FROM usuario INNER JOIN profesional ON usuario.run=profesional.rutprof;";
					PreparedStatement st = conn.prepareStatement(sql);
					rs = st.executeQuery(sql);
					System.out.println("query ejecutada");
					while (rs.next()) {
						Profesional prof = new Profesional();
						prof.setRut(rs.getLong(1));	// el numero es por la columna en la base de datos
						prof.setNombre(rs.getString(2));
						prof.setApellido(rs.getString(3));
						prof.setFechaNacimiento(String.valueOf(rs.getDate(4)));
						prof.setTelefono(rs.getInt(5)); 
						prof.setTituloProfesional(rs.getString(6));
						prof.setProyecto(rs.getString(7));
						
						lista.add(prof);
						System.out.println("Profesional creado");
					}
					System.out.println("saliendo try/catch listarTodos()");
				} catch (Exception e) {
					System.out.println(e + " LISTAR, PROFESIONAL DAO IMPL");
				} finally {
					try {
//						st.close();
//						rs.close();
//						conn.close();
					} catch (Exception e) {
						System.out.println(e + " TRY/CATCH close connections");
					}
				}

				return lista;
	}

	@Override
	public void registrar(Profesional prof) {
		/**SE CREA UN ATRIBUTO QUE CONTIENE LA SENTENCIA INSERT PARA LA BASE DE DATOS
		 * SE PREPARA LA SENTENCIA AL ASIGNARLE VALORES A LAS COLUMNAS
		 * PRIMERO SE SETTEAN LOS DE USUARIO, Y LUEGO EL DEL TIPO DE USUARIO
		 * ESTO DEBIDO A LA FOREIGN KEY
		 * FINALMENTE SE EJECUTAN LAS SENTENCIAS
		 *  */
		System.out.println("pre getConnection");
		//se instancia una nueva conexion con el singleton
		 Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch REGISTRAR PROFESIONAL IMPL\n");
		        String sql = "INSERT INTO usuario(nombre, apellido, fechaNacimiento, run) VALUES (?, ?, ?, ?);";
		        PreparedStatement st = conn.prepareStatement(sql);
		        System.out.println("pre st.SETTER");
		        st.setString(1, prof.getNombre());
		        st.setString(2, prof.getApellido());
		        st.setDate(3, StringToDate(prof.getFechaNacimiento()));
		        st.setLong(4, prof.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query insertar USUARIO \nProsigue insertar datos de administrativo"); //DEBUG
		        
		        String sqlprof = "INSERT INTO profesional(telefono, tituloprofesional,proyecto, rutprof) VALUES (?,?,?,?);";
		        PreparedStatement stmt = conn.prepareStatement(sqlprof);
		        System.out.println("pre stmt.SETTER");
		        stmt.setInt(1, prof.getTelefono());
		        stmt.setString(2, prof.getTituloProfesional());
		        stmt.setString(3, prof.getProyecto());
		        stmt.setLong(4, prof.getRut());

		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para PROFESIONAL");
		        
//		        st.close();
//		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al registrar PROFESIONAL: " + e.getMessage());
		    }
		
	}

	@Override
	public void actualizar(Profesional prof) {
		/**SE CREA UN ATRIBUTO QUE CONTIENE LA SENTENCIA UPDATE PARA LA BASE DE DATOS
		 * SE PREPARA LA SENTENCIA AL ASIGNARLE VALORES A LAS COLUMNAS
		 * PRIMERO SE SETTEAN LOS ATRIBUTOS QUE SE QUIEREN EDITAR DE USUARIO, Y LUEGO EL DEL TIPO DE USUARIO
		 * ESTO DEBIDO A LA FOREIGN KEY EN LA BASE DE DATOS
		 * FINALMENTE SE EJECUTAN LAS SENTENCIAS
		 *  */
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
		        System.out.println("pre executeUpdate usuario");
		        st.executeUpdate();
		        System.out.println("atributos set en la query actualizar USUARIO \nProsigue insertar datos de profesional"); //DEBUG
		        
		        String sqlprof = "UPDATE profesional set telefono = ?, tituloprofesional = ?, proyecto = ? WHERE rutprof = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqlprof);
		        stmt.setInt(1, prof.getTelefono());
		        stmt.setString(2, prof.getTituloProfesional());
		        stmt.setString(3, prof.getProyecto());
		        stmt.setLong(4, prof.getRut());
		        System.out.println("pre executeUpdate profesional");
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para PROFESIONAL");
		        
//		        st.close();
//		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al actualizar PROFESIONAL: " + e.getMessage());
		    }
		
	}

	@Override
	public void eliminar(Profesional prof) {
		/**SE CREA UN ATRIBUTO QUE CONTIENE LA SENTENCIA DELETE PARA LA BASE DE DATOS
		 * SE PREPARA LA SENTENCIA AL ASIGNARLE VALORES A LAS COLUMNAS
		 * PRIMERO SE SETTEA EL ATRIBUTO CON EL QUE SE ENCONTRARA EL REGISTRO A ELIMINAR (RUT)
		 * LUEGO SE EJECUTA LA SENTENCIA, PRIMERO SE ELIMINAN LOS DATOS DEL TIPO DE USUARIO
		 * LUEGO LOS DATOS DEL USUARIO PER SE
		 * ESTO DEBIDO A LA FOREIGN KEY EN LA BASE DE DATOS
		 *  */
		Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch ELIMINAR PROFESIONAL IMPL\n");
		        String sql = "DELETE FROM profesional WHERE rutprof = (?);";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setLong(1, prof.getRut());
		        System.out.println("pre executeUpdate profesional");
		        st.executeUpdate();
		        System.out.println("atributos set en la query eliminar PROFESIONAL \nProsigue eliminacion de datos USUARIO"); //DEBUG
		        
		        String sqlprof = "DELETE FROM usuario WHERE run = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqlprof);
		        stmt.setLong(1, prof.getRut());
		        System.out.println("pre executeUpdate usuario");
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para USUARIO");
		        
//		        st.close();
//		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al eliminar PROFESIONAL: " + e.getMessage());
		    }
		
	}

	public static Date StringToDate(String fecha) {
		Date date = Date.valueOf(fecha);
		return date;
	}
}
