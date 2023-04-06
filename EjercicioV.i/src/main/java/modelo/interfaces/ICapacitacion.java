package modelo.interfaces;

import java.util.List;

import modelo.clases.Capacitacion;

public interface ICapacitacion {

	public List<Capacitacion> listaCapacitaicon();
	
	public void registrar(Capacitacion capacitacion);
}
