package modelo.implementacion;

import java.util.List;
import java.util.ArrayList;

import modelo.clases.Capacitacion;
import modelo.interfaces.ICapacitacion;

public class ImplementacionInterfazCapacitacion implements ICapacitacion {

	@Override
	public List<Capacitacion> listaCapacitacion() {
		// TODO Auto-generated method stub
		List<Capacitacion> lista = new ArrayList<Capacitacion>();

		Capacitacion cap1 = new Capacitacion("1", "24/06/2022", "12:00", "Quilpue", "60", 12345678);
		Capacitacion cap2 = new Capacitacion("2", "03/04/2023", "10:00", "Valparaiso", "120", 12234566);
		Capacitacion cap3 = new Capacitacion("3", "01/02/2023", "11:00", "Con-Con", "30", 11223345);
		
		lista.add(cap1);
		lista.add(cap2);
		lista.add(cap3);
		return lista;
	}

	@Override
	public void registrarConsola(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		capacitacion.toString();
	}

}
