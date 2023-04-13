/**
 * 
 * @author Valentina Saldias 
 * @author Javiera Saavedra
 * @author Adrian Fredes
 * @author Carlos Carrasco
 * @contact https://github.com/mundenius/m5Java
 */
package modelo.clases;

public class Profesional extends Usuario { // clase Profesional extiende de la clase Usuario

	//variables privadas 
	private int idProfesional;
	private int telefono;
	private String tituloProfesional;
	private String proyecto;

	//constructor sin parametros
	public Profesional() {

	}

	//constructor con parametros
	public Profesional(int idUsuario, String nombre, String apellido, String fechaNacimiento, long rut,
			int idProfesional, int telefono, String tituloProfesional, String proyecto) {
		super(idUsuario, nombre, apellido, fechaNacimiento, rut);

	}

	//getters y setters
	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getTituloProfesional() {
		return tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	//metodo toString devuelve cadena de texto representando objeto actual de Profesional
	@Override
	public String toString() {
		return "ID Profesional: " + getIdProfesional() + "\nTelefono: " + getTelefono() + "\nTitulo Profesional: "
				+ getTituloProfesional() + "\nProyecto: " + getProyecto();
	}
}
