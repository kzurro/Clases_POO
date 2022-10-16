package clases;

public class Palo {

	String nombre;

	public String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Palo() {

	}

	public Palo(String nombre) {
		setNombre(nombre);
	}

	@Override
	public String toString() {
		return " " + getNombre();
	}
	
	

}
