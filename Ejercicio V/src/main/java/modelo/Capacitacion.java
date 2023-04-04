package modelo;

public class Capacitacion {
	private int idCapacitacion;
	private Long runClienteCapa;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantAsistentes;
	
	public Capacitacion(int idCapacitacion, long runClienteCapa, String dia, String hora, String lugar, String duraion, int cantAsistentes, String duracion) {
		this.idCapacitacion = idCapacitacion;
		this.runClienteCapa = runClienteCapa;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
		
	}
	public Capacitacion () {
		
	}
	public int getIdCapacitacion() {
		return idCapacitacion;
	}
	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}
	public Long getRunClienteCapa() {
		return runClienteCapa;
	}
	public void setRunClienteCapa(Long runClienteCapa) {
		this.runClienteCapa = runClienteCapa;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public int getCantAsistentes() {
		return cantAsistentes;
	}
	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}
	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", runClienteCapa=" + runClienteCapa + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantAsistentes="
				+ cantAsistentes + "]";
	}
	

}
