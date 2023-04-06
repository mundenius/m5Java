package modelo.clases;

public class Capacitacion {

	private String idCapacitacion;
	private String fechaCap;
	private String hora;
	private String lugar;
	private String duracionCap;
	private int idUsuario_Run;
	
	public Capacitacion() {
	}


	public Capacitacion(String idCapacitacion, String fechaCap, String hora, String lugar, String duracionCap,
			int idUsuario_Run) {
		this.idCapacitacion = idCapacitacion;
		this.fechaCap = fechaCap;
		this.hora = hora;
		this.lugar = lugar;
		this.duracionCap = duracionCap;
		this.idUsuario_Run = idUsuario_Run;
	}

	public void setIdCapacitacion(String idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setFechaCap(String fechaCap) {
		this.fechaCap = fechaCap;
	}

	public String getFechaCap() {
		return fechaCap;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getHora() {
		return hora;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getLugar() {
		return lugar;
	}

	public void setDuracionCap(String duracionCap) {
		this.duracionCap = duracionCap;
	}

	public String getDuracionCap() {
		return duracionCap;
	}

	public void setIdUsuario_Run(int idUsuario_Run) {
		this.idUsuario_Run = idUsuario_Run;
	}

	public int getIdUsuario_Run() {
		return idUsuario_Run;
	}

	@Override
	public String toString() {
		return "\nToString\nId capacitacion: " + getIdCapacitacion() + "\nFecha: " + getFechaCap() + "\nHora: " + getHora()
				+ "\nLugar: " + getLugar() + "\nduracion: " + getDuracionCap() + "\nRut del cliente: "
				+ getIdUsuario_Run();
	}
}


