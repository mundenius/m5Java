package modelo.interfaces;

import java.util.List;

import modelo.clases.Capacitacion;

public interface ICapacitacion {

	public List<Capacitacion> listaCapacitacion();
	
	public void registrarConsola(Capacitacion capacitacion);
}
