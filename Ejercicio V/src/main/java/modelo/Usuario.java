package modelo;

public class Usuario {
	private String nombreUsuario;
	private String fechaNacimientoUsuario;
	private Long runUsuario;
	
	public Usuario(String nombre, String fechaNacimiento, Long run) {
		this.nombreUsuario = nombre;
		this.fechaNacimientoUsuario = fechaNacimiento;
		this.runUsuario = run;
		
	}
	public Usuario() {
		
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getFechaNacimientoUsuario() {
		return fechaNacimientoUsuario;
	}
	public void setFechaNacimientoUsuario(String fechaNacimientoUsuario) {
		this.fechaNacimientoUsuario = fechaNacimientoUsuario;
	}
	public Long getRunUsuario() {
		return runUsuario;
	}
	public void setRunUsuario(Long runUsuario) {
		this.runUsuario = runUsuario;
	}
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", fechaNacimientoUsuario=" + fechaNacimientoUsuario
				+ ", runUsuario=" + runUsuario + "]";
	}
	
}
