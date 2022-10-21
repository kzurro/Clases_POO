package interfaces;

public class Coche extends Vehiculo implements Pintable {

	final static int RUEDAS_DEF = 4;

	String color;
	int numPuertas;
	int motor;

	public String getColor() {
		return color;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public int getMotor() {
		return motor;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	protected void setMotor(int motor) {
		this.motor = motor;
	}

	public Coche() {
		this(RUEDAS_DEF);

	}

	public Coche(int numRuedaS) {
		this(numRuedaS, "", 0, 0);

	}

	public Coche(int numRuedaS, String color, int numPuertas, int motor) {
		super(numRuedaS);
		setColor(color);
		setNumPuertas(numPuertas);
		setMotor(motor);
	}

	@Override
	public double pagarImpuesto() {
		return Vehiculo.getFactorImpuesto() * motor;

	}

	@Override
	public boolean esReparable() {
		return getMotor() != 0;
	}

	@Override
	public String cambiarColor(String colorCambio) {
		String mensaje = "Yo soy " + getColor() + ", y me quieren cambiar " + colorCambio;
		setColor(colorCambio);
		return mensaje;
	}

}
