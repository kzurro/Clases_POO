package herencia;

public class Lavadora extends Electrodomestico {
	private final static int CARGA_DEFECTO = 5;

	private int carga;

	public int getCarga() {
		return carga;
	}

	protected void setCarga(int carga) {
		this.carga = carga == 0 ? CARGA_DEFECTO : carga;
	}

	public Lavadora() {
		super();

	}

	public Lavadora(double precioBase, ColorDisponbible color, char consumo, double peso, int carga) {
		super(precioBase, color, consumo, peso);
		setCarga(carga);
	}

	public Lavadora(double precioBase, double peso) {
		this(precioBase, null, ' ', peso, 0);
	}

	public double precioFinal() {
		return getCarga() > 30 ? super.precioFinal() + 50 : super.precioFinal();
	}

}
