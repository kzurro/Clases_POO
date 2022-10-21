package interfaces;

public abstract class Vehiculo implements Arrancable {

	private final static double FACTOR_IMPUESTO = 0.25;

	private int numRuedas;

	public static double getFactorImpuesto() {
		return FACTOR_IMPUESTO;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	protected void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public Vehiculo() {

	}

	public Vehiculo(int numRuedas) {
		setNumRuedas(numRuedas);
	}

	public abstract double pagarImpuesto();

}
