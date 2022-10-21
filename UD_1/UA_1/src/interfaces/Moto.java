package interfaces;

public class Moto extends Vehiculo {

	private final static int RUEDAS_DEF = 2;

	private double cilindrada;
	private boolean carenado;

	public static int getRuedasDef() {
		return RUEDAS_DEF;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public boolean isCarenado() {
		return carenado;
	}

	protected void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	protected void setCarenado(boolean carenado) {
		this.carenado = carenado;
	}

	public Moto() {
		this(RUEDAS_DEF);

	}

	public Moto(int numRuedas) {
		this(numRuedas, 0, false);
	}

	public Moto(int numRuedas, double cilindrada, boolean carenado) {
		super(numRuedas);
		setCilindrada(cilindrada);
		setCarenado(carenado);
	}

	@Override
	public double pagarImpuesto() {
		return carenado ? cilindrada * Vehiculo.getFactorImpuesto() + 12.33 : cilindrada * Vehiculo.getFactorImpuesto();
	}

	@Override
	public void arrancar() {
		System.out.println("Soy una " + Moto.class.getSimpleName() + " estoy arrancando...");

	}

}
