package modelo;

public class Profesional extends Usuario{
	
	private String titulo;
	private String fechaIngreso;


	public Profesional(Usuario usuario) {
	super(usuario.getNombreUsuario(), usuario.getFechaNacimientoUsuario(), usuario.getRunUsuario());
	}

	public Profesional(String nombre, String fechaNacimiento, Long run, String titulo, String fechaIngreso) {
	super(nombre, fechaNacimiento, run);
	this.titulo = titulo;
	this.fechaIngreso = fechaIngreso;		
	}
	public Profesional () {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
}