package herencia;

public class Lavadora extends Electrodomestico {

	// Constantes

	private final static int CARGA_DEF = 5;

	// Atributos

	private int carga;

	// Accesores
	public int getCarga() {
		return carga;
	}

	public static int getCargaDef() {
		return CARGA_DEF;
	}

	protected void setCarga(int carga) {
		this.carga = carga;
	}

	// Constructores

	public Lavadora() {
		this(Electrodomestico.getPrecioBaseDef(), Electrodomestico.getPesoDef(),
				Electrodomestico.getConsumoEnergeticoDef(), Electrodomestico.getColorDef(), getCargaDef());
	}

	public Lavadora(double precioBase, double peso) {
		this(precioBase, peso, Electrodomestico.getConsumoEnergeticoDef(), Electrodomestico.getColorDef(), CARGA_DEF);

	}

	public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga) {
		super(precioBase, peso, consumoEnergetico, color);
		setCarga(carga);
	}

	public double precioFinal() {
		// Invocamos el método precioFinal del método padre
		double plus = super.precioFinal();
		// añadimos el plus por la carga
		if (getCarga() > 30) {
			plus += 50;
		}

		return plus;
	}
}