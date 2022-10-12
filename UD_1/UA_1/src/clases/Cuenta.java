package clases;

public class Cuenta {
	// Atributos
	private String titular;
	private double cantidad;

	// Metodos
	public String getTitular() {
		return titular;
	}

	protected void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	protected void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	// Constructores
	public Cuenta(String titular) {
		this(titular, 0); // Sobrecarga
	}

	public Cuenta(String titular, double cantidad) {
		setTitular(titular);
		// Si la cantidad es menor que cero, lo ponemos a cero
		if (cantidad < 0) {
			this.cantidad = 0;
		} else {
			this.cantidad = cantidad;
		}
	}

	/**
	 * Ingresa dinero en la cuenta, solo si es positivo la cantidad
	 *
	 * @param cantidad
	 */
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
	}

	/**
	 * Retira una cantidad en la cuenta, si se quedara en negativo se quedaria en
	 * cero
	 *
	 * @param cantidad
	 */
	public void retirar(double cantidad) {
		if (this.cantidad - cantidad < 0) {
			System.out.println("El máximo que se va a retirar es: " + getCantidad());
			setCantidad(0);;
		} else {
			this.cantidad -= cantidad;
		}
	}

	/**
	 * Devuelve el estado del objeto
	 *
	 * @return
	 */
	@Override
	public String toString() {
		return "El titular " + getTitular() + " tiene " + getCantidad() + " euros en la cuenta";
	}

}