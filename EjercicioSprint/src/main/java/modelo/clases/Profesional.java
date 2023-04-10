package modelo.clases;

public class Profesional extends Usuario {

	private int idProfesional;
	private int telefono;
	private String tituloProfesional;
	private String proyecto;

	public Profesional() {

	}

	public Profesional(int idUsuario, String nombre, String apellido, String fechaNacimiento, long rut,
			int idProfesional, int telefono, String tituloProfesional, String proyecto) {
		super(idUsuario, nombre, apellido, fechaNacimiento, rut);

	}

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

	@Override

	public String toString() {
		return "ID Profesional: " + getIdProfesional() + "\nTelefono: " + getTelefono() + "\nTitulo Profesional: "
				+ getTituloProfesional() + "\nProyecto: " + getProyecto();
	}
}
