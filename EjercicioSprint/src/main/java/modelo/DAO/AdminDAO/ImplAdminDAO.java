package modelo.DAO.AdminDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.clases.Administrativo;
import modelo.clases.Usuario;
import modelo.conexion.Singleton;

public class ImplAdminDAO implements IAdminDAO{

	ResultSet rs;
	PreparedStatement st;
	PreparedStatement stmt;

	@Override
	public List<Administrativo> listarTodos() {
		// se instancia una nueva conexion con el singleton a la base de datos
		Connection conn = Singleton.getConnection();
		System.out.println("llegó la conexion.. " + conn); // debug
		// TODO Auto-generated method stub
		List<Administrativo> lista = new ArrayList<Administrativo>();
		/**SE CREA UNA LISTA PARA ALMACENAR OBJETOS QUE SE TRAERAN DE LA BASE DE DATOS
		 * SE CREA UN ATRIBUTO QUE CONTIENE LA SENTENCIA SELECT PARA LA BASE DE DATOS
		 * SE PREPRARA EL STATEMENT, Y SE EJECUTA
		 * EL RESULSET GENERARA RESULTADOS, LOS CUALES SE CAPTURARAN EN EL WHILE LOOP
		 * POR CADA VEZ QUE SE EJECUTE EL WHILE LOOP, SE CREARA UN NUEVO OBJETO DE LO QUE SE ESTA LISTANDO
		 * FINALMENTE SE AGREGA CADA OBJETO A LA LISTA DE OBJETOS
		 *  */
		try {
			String sql = "SELECT usuario.run, usuario.nombre, usuario.apellido, usuario.fechanacimiento, administrativo.email, administrativo.area FROM usuario INNER JOIN administrativo ON usuario.run=administrativo.rutadmin;";
			PreparedStatement st = conn.prepareStatement(sql);
			rs = st.executeQuery(sql);
			System.out.println("query ejecutada");
			while (rs.next()) {
				Administrativo admin = new Administrativo();
				admin.setRut(rs.getLong(1));	// el numero es por la columna en la base de datos
				admin.setNombre(rs.getString(2));
				admin.setApellido(rs.getString(3));
				admin.setFechaNacimiento(String.valueOf(rs.getDate(4)));
				admin.setEmail(rs.getString(5)); 
				admin.setArea(rs.getString(6));
				
				lista.add(admin);
				System.out.println("Administrativo creado");
			}
			System.out.println("saliendo try/catch listarTodos()");
		} catch (Exception e) {
			System.out.println(e + " LISTAR, ADMIN DAO IMPL");
		} finally {
			try {
//				st.close();
//				rs.close();
//				conn.close();
			} catch (Exception e) {
				System.out.println(e + " TRY/CATCH close connections");
			}
		}

		return lista;
	}

	@Override
	public void registrar(Administrativo admin) {
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
				System.out.println("just entered try/catch REGISTRAR ADMINISTRATIVO IMPL\n");
		        String sql = "INSERT INTO usuario(nombre, apellido, fechanacimiento, run) VALUES (?, ?, ?, ?);";
		        PreparedStatement st = conn.prepareStatement(sql);
		        System.out.println("pre st.SETTER");
		        st.setString(1, admin.getNombre());
		        st.setString(2, admin.getApellido());
		        st.setDate(3, StringToDate(admin.getFechaNacimiento()));
		        st.setLong(4, admin.getRut());
		        System.out.println("pre executeUpdate");
		        st.executeUpdate();
		        System.out.println("atributos set en la query insertar USUARIO \nProsigue insertar datos de administrativo"); //DEBUG
		        
		        String sqladmin = "INSERT INTO administrativo(email, area, rutadmin) VALUES (?,?,?);";
		        PreparedStatement stmt = conn.prepareStatement(sqladmin);
		        stmt.setString(1, admin.getEmail());
		        stmt.setString(2, admin.getArea());
		        stmt.setLong(3, admin.getRut());
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para ADMINISTRATIVO");
		        
//		        st.close();
//		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al registrar ADMINISTRATIVO: " + e.getMessage());
		    }
		
	}

	@Override
	public void actualizar(Administrativo admin) {
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
				System.out.println("just entered try/catch ACTUALIZAR ADMINISTRATIVO IMPL\n");
		        String sql = "UPDATE usuario set nombre = (?), apellido = (?), fechaNacimiento = (?) WHERE run = (?);";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setString(1, admin.getNombre());
		        st.setString(2, admin.getApellido());
		        st.setDate(3, StringToDate(admin.getFechaNacimiento()));
		        st.setLong(4, admin.getRut());
		        System.out.println("pre executeUpdate usuario");
		        st.executeUpdate();
		        System.out.println("atributos set en la query actualizar USUARIO \nProsigue insertar datos de administrativo"); //DEBUG
		        
		        String sqladmin = "UPDATE administrativo set email = ?, area = ? WHERE rutadmin = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqladmin);
		        stmt.setString(1, admin.getEmail());
		        stmt.setString(2, admin.getArea());
		        stmt.setLong(3, admin.getRut());
		        System.out.println("pre executeUpdate admin");
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para ADMINISTRATIVO");
		        
//		        st.close();
//		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al actualizar ADMINISTRATIVO: " + e.getMessage());
		    }
		
	}

	@Override
	public void eliminar(Administrativo admin) {
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
				System.out.println("just entered try/catch ELIMINAR ADMINISTRATIVO IMPL\n");
		        String sql = "DELETE FROM administrativo WHERE rutadmin = ?;";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setLong(1, admin.getRut());
		        System.out.println("pre executeUpdate administrativo");
		        st.executeUpdate();
		        System.out.println("atributos set en la query eliminar ADMINISTRATIVO \nProsigue eliminacion de datos USUARIO"); //DEBUG
		        
		        String sqladmin = "DELETE FROM usuario WHERE run = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqladmin);
		        stmt.setLong(1, admin.getRut());
		        System.out.println("pre executeUpdate usuario");
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para USUARIO");
		        
//		        st.close();
//		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al eliminar ADMINISTRATIVO: " + e.getMessage());
		    }
		
	}

	public static Date StringToDate(String fecha) {
		Date date = Date.valueOf(fecha);
		return date;
	}
}
