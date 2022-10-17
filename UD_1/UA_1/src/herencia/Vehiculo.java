package herencia;

public class Vehiculo {

	int numeroRuedas;
	private String marca;
	protected String color;

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	protected void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	public Vehiculo() {
	}

	public Vehiculo(int numeroRuedas, String marca, String color) {
		setMarca(marca);
		setColor(color);
		setNumeroRuedas(numeroRuedas);
	}

	@Override
	public String toString() {
		return "Vehiculo de " + getNumeroRuedas() + " ruedas, modelo =>" + getMarca() + " y color " + getColor();
	}

}
