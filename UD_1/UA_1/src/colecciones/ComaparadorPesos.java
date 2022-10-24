package colecciones;

import java.util.Comparator;

import herencia.Electrodomestico;

public class ComaparadorPesos implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Electrodomestico e1 = (Electrodomestico) o1;
		Electrodomestico e2 = (Electrodomestico) o2;
		return (int) (e1.getPeso() - e2.getPeso());
	}

	

}
