package modelo.clases;

public class Capacitacion {

	String idCapacitacion;
	String fechaCap;
	String hora;
	String lugar;
	String duracionCap;
	int cliente_rutcliente;
	
	public Capacitacion() {
	}


	public Capacitacion(String idCapacitacion, String fechaCap, String hora, String lugar, String duracionCap,
			int cliente_rutcliente) {
		this.idCapacitacion = idCapacitacion;
		this.fechaCap = fechaCap;
		this.hora = hora;
		this.lugar = lugar;
		this.duracionCap = duracionCap;
		this.cliente_rutcliente = cliente_rutcliente;
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

	public void setCliente_rutcliente(int cliente_rutcliente) {
		this.cliente_rutcliente = cliente_rutcliente;
	}

	public int getCliente_rutcliente() {
		return cliente_rutcliente;
	}

	@Override
	public String toString() {
		return "\nToString\nId capacitacion: " + getIdCapacitacion() + "\nFecha: " + getFechaCap() + "\nHora: " + getHora()
				+ "\nLugar: " + getLugar() + "\nduracion: " + getDuracionCap() + "\nRut del cliente: "
				+ getCliente_rutcliente();
	}
}


