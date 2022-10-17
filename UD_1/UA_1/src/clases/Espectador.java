package clases;

public class Espectador {

	private String nombre;
	private int edad;
	private double dinero;

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getDinero() {
		return dinero;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public Espectador() {

	}

	public Espectador(String nombre, int edad, double dinero) {
		setNombre(nombre);
		setEdad(edad);
		setEdad(edad);
	}

	public boolean tieneEdad(int edadMinima) {
		return getEdad() >= edadMinima;
	}

	public boolean tieneDinero(double precioEntrada) {
		return getDinero() >= precioEntrada;
	}

	public void pagarEntrada(double precioEntrada) {
		setDinero(getDinero() - precioEntrada);
	}

	@Override
	public String toString() {
		return "Espectador es: " + getNombre() + " de " + getEdad() + " años y con " + getDinero() + " €";
	}
}
