package herencia;

public class Electrodomestico implements Comparable<Electrodomestico> {

	// Constantes

	private final static String COLOR_DEF = "blanco";
	private final static char CONSUMO_ENERGETICO_DEF = 'F';
	private final static double PRECIO_BASE_DEF = 100;
	private final static String[] COLORES = { "blanco", "negro", "rojo", "azul", "gris" };

	/**
	 * Peso por defecto
	 */
	protected final static double PESO_DEF = 5;

	// atributos

	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;

	// accesores

	public static String getColorDef() {
		return COLOR_DEF;
	}

	public static char getConsumoEnergeticoDef() {
		return CONSUMO_ENERGETICO_DEF;
	}

	public static double getPrecioBaseDef() {
		return PRECIO_BASE_DEF;
	}

	public static double getPesoDef() {
		return PESO_DEF;
	}

	public static String[] getColores() {
		return COLORES;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	protected void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	// constructores

	public Electrodomestico() {
		this(getPrecioBaseDef(), getPesoDef(), getConsumoEnergeticoDef(), getColorDef());
	}

	public Electrodomestico(double precio, double peso) {
		this(precio, peso, getConsumoEnergeticoDef(), getColorDef());
	}

	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
		setPrecioBase(precioBase);
		setPeso(peso);
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

	/**
	 * 
	 * @param consumoEnergetico
	 * @see <a href=
	 *      "https://es.m.wikipedia.org/wiki/Archivo:ASCII-Table-wide.svg"/>Equivalencia
	 *      Char ASCII</a>
	 * 
	 *      Solo tenido en cuenta las mayúsculas
	 */
	private void comprobarConsumoEnergetico(char consumoEnergetico) {

		if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
			setConsumoEnergetico(consumoEnergetico);
		} else {
			setConsumoEnergetico(getConsumoEnergeticoDef());
		}

	}

	private void comprobarColor(String color) {

		boolean encontrado = false;

		for (int i = 0; i < getColores().length && !encontrado; i++) {
			if (getColores()[i].equals(color)) {
				encontrado = true;
			}

		}

		if (encontrado) {
			setColor(color);
		} else {
			setColor(COLOR_DEF);
		}

	}

	public double precioFinal() {
		double plus = 0;
		switch (consumoEnergetico) {
		case 'A':
			plus += 100;
			break;
		case 'B':
			plus += 80;
			break;
		case 'C':
			plus += 60;
			break;
		case 'D':
			plus += 50;
			break;
		case 'E':
			plus += 30;
			break;
		case 'F':
			plus += 10;
			break;
		}

		if (peso >= 0 && peso < 19) {
			plus += 10;
		} else if (peso >= 20 && peso < 49) {
			plus += 50;
		} else if (peso >= 50 && peso <= 79) {
			plus += 80;
		} else if (peso >= 80) {
			plus += 100;
		}

		return precioBase + plus;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + getColor() + ", Tipo " + getConsumoEnergetico() + ", precio  "
				+ precioFinal() + " € y pesa " + getPeso() + " kg";
	}

	@Override
	public int compareTo(Electrodomestico o) {
		int resultado;
		if (getConsumoEnergetico() > o.getConsumoEnergetico()) {
			resultado = 1;
		}
		if (getConsumoEnergetico() < o.getConsumoEnergetico()) {
			resultado = -1;
		} else {
			resultado = 0;
		}

		return resultado;
	}

}
