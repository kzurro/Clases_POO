package herencia;

public class Electrodomestico {
	// Constantes

	private final static String COLOR_DEF = "blanco";
	private final static char CONSUMO_ENERGETICO_DEF = 'F';
	private final static double PRECIO_BASE_DEF = 100;

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
		setConsumoEnergetico(consumoEnergetico);
		setColor(color);
	}

}
