package herencia;

public class Television extends Electrodomestico {

	private final static int RESOLUCION_DEFECTO = 20;

	private int resolucion;
	private boolean smartTV;

	public static int getResolucionDefecto() {
		return RESOLUCION_DEFECTO;
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

	public Television(double precioBase, double peso, char consumo, ColorDisponbible color, int resolucion,
			boolean smartTV) {
		super(precioBase, color, consumo, peso);
		setResolucion(resolucion);
		setSmartTV(smartTV);
	}

	public Television(double precioBase, double peso) {
		this(precioBase, peso, ' ', null, getResolucionDefecto(), false);

	}

	public Television() {
		this(100, 0, ' ', null, RESOLUCION_DEFECTO, false);
	}

	public double precioFinal() {
		double plus = super.precioFinal();

		if (getResolucion() > 40) {
			plus += plus * 0.3;
		}
		if (isSmartTV()) {
			plus += 50;
		}
		return plus;
	}

}
