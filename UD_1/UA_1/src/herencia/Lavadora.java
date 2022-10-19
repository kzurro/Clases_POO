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
		// TODO Auto-generated constructor stub
	}

	public Lavadora(double precioBase, ColorDisponbible color, char consumo, double peso, int carga) {
		super(precioBase, color, consumo, peso);
		setCarga(carga);
	}

	public Lavadora(double precioBase, double peso) {
		this(precioBase, null, ' ', peso, 0);
	}

}
