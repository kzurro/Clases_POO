package herencia;

public class Television extends Electrodomestico {
	// Constantes

	private final static int RESOLUCION_DEF = 20;

	// Atributos

	private int resolucion;
	private boolean smartTV;

	// accesores

	public static int getResolucionDef() {
		return RESOLUCION_DEF;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	protected void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	protected void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}

	// Constructores

	public Television() {
		this(Electrodomestico.getPrecioBaseDef(), Electrodomestico.getPesoDef(),
				Electrodomestico.getConsumoEnergeticoDef(), Electrodomestico.getColorDef(), getResolucionDef(), false);
	}

	public Television(double precioBase, double peso) {
		this(precioBase, peso, Electrodomestico.getConsumoEnergeticoDef(), Electrodomestico.getColorDef(),
				getResolucionDef(), false);
	}

	public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, peso, consumoEnergetico, color);
		setResolucion(resolucion);
		setSmartTV(sintonizadorTDT);
	}

	public double precioFinal() {
		// Invocamos el método precioFinal del método padre
		double plus = super.precioFinal();

		// Añadimos el sobrecoste
		if (getResolucion() > 40) {
			plus += super.getPrecioBase() * 0.3;
		}
		if (isSmartTV()) {
			plus += 50;
		}

		return plus;
	}
}